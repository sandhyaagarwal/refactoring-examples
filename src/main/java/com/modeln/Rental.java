package com.modeln;
class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public Movie getMovie() {
        return this._movie;
    }

    public int getDaysRented() {
        return this._daysRented;
    }



}
