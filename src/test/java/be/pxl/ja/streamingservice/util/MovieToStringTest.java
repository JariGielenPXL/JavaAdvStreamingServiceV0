package be.pxl.ja.streamingservice.util;

import be.pxl.ja.streamingservice.model.Movie;
import be.pxl.ja.streamingservice.model.Rating;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieToStringTest {
    private Movie movie;

    @BeforeEach
    public void init() {
        movie = new Movie("Titanic", Rating.MATURE);
    }

    @Test
    public void toStringReturnsTitleAndYear(){
        movie.setReleaseDate(LocalDate.of(2001,1,26));

        assertEquals(movie.getTitle() + " (" + movie.getReleaseDate().getYear() + ")",movie.toString());
    }

    @Test
    public void returnsTitleWhenReleaseDateIsNull(){
        assertEquals(movie.getTitle(),movie.toString());
    }
}
