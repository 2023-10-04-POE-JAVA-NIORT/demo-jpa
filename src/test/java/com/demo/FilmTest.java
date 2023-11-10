package com.demo;

import com.demo.jpa.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class FilmTest
{

    @Test
    void testCreateFilm1(){
        Film film1 = new Film("Les bronzés",
                LocalDate.of(1978, 11, 22), false, Genre.COMEDIE);
        FilmDAO.save(film1);
    }

    @Test
    void testCreateFilm2(){
        Film film1 = new Film(null,
                LocalDate.of(1978, 11, 22), false, Genre.COMEDIE);
        FilmDAO.save(film1);
    }
}
