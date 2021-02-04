package com.modeln;

import java.util.Objects;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;
    private int _priceCode;

    public Movie(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
    }

    public String getTitle() {
        return this._title;
    }

    public void setTitle(String _title) {
        this._title = _title;
    }

    public int getPriceCode() {
        return this._priceCode;
    }

    public void setPriceCode(int _priceCode) {
        this._priceCode = _priceCode;
    }

    public Movie _title(String _title) {
        this._title = _title;
        return this;
    }

    public Movie _priceCode(int _priceCode) {
        this._priceCode = _priceCode;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Movie)) {
            return false;
        }
        Movie movie = (Movie) o;
        return Objects.equals(_title, movie._title) && Objects.equals(_priceCode, movie._priceCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(_title, _priceCode);
    }

    @Override
    public String toString() {
        return "{" +
            " _title='" + getTitle() + "'" +
            ", _priceCode='" + getPriceCode() + "'" +
            "}";
    }

}
