package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {
    @Test
    public void addMovie() {

        MovieManager manager = new MovieManager();
        String film1 = "film1";
        String film2 = "film2";


        manager.NewFilms(film1);
        manager.NewFilms(film2);

        String[] expected = {film1, film2};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void lastMovie() {
        MovieManager manager = new MovieManager(2);

        String film1 = "film1";
        String film2 = "film2";

        manager.NewFilms(film1);
        manager.NewFilms(film2);


        String[] expected = {film2, film1};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void lastMovie2() {

        MovieManager manager = new MovieManager();
        String film1 = "film1";
        String film2 = "film2";
        String film3 = "film3";
        String film4 = "film4";
        String film5 = "film5";
        String film6 = "film6";
        String film7 = "film7";
        String film8 = "film8";
        String film9 = "film9";
        String film10 = "film10";
        String film11 = "film11";


        manager.NewFilms(film2);
        manager.NewFilms(film3);
        manager.NewFilms(film4);
        manager.NewFilms(film5);
        manager.NewFilms(film6);
        manager.NewFilms(film7);
        manager.NewFilms(film8);
        manager.NewFilms(film9);
        manager.NewFilms(film10);
        manager.NewFilms(film11);

        String[] expected = {film11, film10, film9, film8, film7, film6, film5, film4, film3, film2};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }
}

