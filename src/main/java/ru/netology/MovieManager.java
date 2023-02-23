package ru.netology;

public class MovieManager {
    private String[] films = new String[0];
    private int maxMovie;

    public MovieManager() {
        this.maxMovie = 10;
    }

    public MovieManager(int maxMovie) {
        this.maxMovie = maxMovie;
    }

    public void NewFilms(String args) {
        String[] addMovie = new String[films.length + 1];
        for (int i = 0; i < films.length; i++) {
            addMovie[i] = films[i];
        }
        addMovie[addMovie.length - 1] = args;
        films = addMovie;
    }

    public String[] findAll() {
        return films;
    }

    public String[] findLast() {
        int resultLength;
        if (films.length < maxMovie) {
            resultLength = films.length;
        } else {
            resultLength = maxMovie;
        }
        String[] lastFilm = new String[resultLength];
        for (int i = 0; i < films.length; i++) {
            lastFilm[i] = films[films.length - 1 - i];
        }
        return lastFilm;
    }
}


