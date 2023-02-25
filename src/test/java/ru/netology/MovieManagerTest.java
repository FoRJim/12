package ru.netology;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {
    @Test
    public void addMovie() {

        MovieManager manager = new MovieManager();
        String film1 = "film1";
        String film2 = "film2";


        manager.newFilms(film1);
        manager.newFilms(film2);

        String[] expected = {film1, film2};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void addMovie2() {

        MovieManager manager = new MovieManager();
        String film1 = "film1";
        String film2 = "film2";
        String film3 = "film3";
        String film4 = "film4";
        String film5 = "film5";

        manager.newFilms(film1);
        manager.newFilms(film2);
        manager.newFilms(film3);
        manager.newFilms(film4);
        manager.newFilms(film5);

        String[] expected = {film1, film2, film3, film4, film5};
        String[] actual = manager.findAll();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void lastMovie() {
        MovieManager manager = new MovieManager();

        String film1 = "film1";
        String film2 = "film2";

        manager.newFilms(film1);
        manager.newFilms(film2);


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

        manager.newFilms(film2);
        manager.newFilms(film3);
        manager.newFilms(film4);
        manager.newFilms(film5);
        manager.newFilms(film6);
        manager.newFilms(film7);
        manager.newFilms(film8);
        manager.newFilms(film9);
        manager.newFilms(film10);
        manager.newFilms(film11);

        String[] expected = {film11, film10, film9, film8, film7, film6, film5, film4, film3, film2};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void lastMovie3() {

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

        manager.newFilms(film6);
        manager.newFilms(film7);
        manager.newFilms(film8);
        manager.newFilms(film9);
        manager.newFilms(film10);


        String[] expected = {film10, film9, film8, film7, film6};
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void moviesUnderTheLimit() {

        MovieManager manager = new MovieManager(7);

        String film1 = "film1";
        String film2 = "film2";
        String film3 = "film3";
        String film4 = "film4";
        String film5 = "film5";
        String film6 = "film6";
        String film7 = "film7";

        manager.newFilms(film1);
        manager.newFilms(film2);
        manager.newFilms(film3);
        manager.newFilms(film4);
        manager.newFilms(film5);
        manager.newFilms(film6);
        manager.newFilms(film7);


        String[] expected = {film7, film6, film5, film4, film3, film2, film1};
        String[] actual = manager.findLast();
    }

    @Test
    public void moviesOverTheLimit() {
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

        manager.newFilms(film2);
        manager.newFilms(film3);
        manager.newFilms(film4);
        manager.newFilms(film5);
        manager.newFilms(film6);
        manager.newFilms(film7);
        manager.newFilms(film8);
        manager.newFilms(film9);
        manager.newFilms(film10);
        manager.newFilms(film11);

        String[] expected = {film11, film10, film9, film8, film7, film6, film5, film4, film3, film2 };
        String[] actual = manager.findLast();

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void maxMovieLimit() {
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

        manager.newFilms(film1);
        manager.newFilms(film2);
        manager.newFilms(film3);
        manager.newFilms(film4);
        manager.newFilms(film5);
        manager.newFilms(film6);
        manager.newFilms(film7);
        manager.newFilms(film8);
        manager.newFilms(film9);
        manager.newFilms(film10);

        String[] expected = {film10, film9, film8, film7, film6, film5, film4, film3, film2, film1};
        String[] actual = manager.findLast();
    }
}

