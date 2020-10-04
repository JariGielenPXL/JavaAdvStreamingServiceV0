package be.pxl.ja.streamingservice.util;

import be.pxl.ja.streamingservice.model.Movie;
import be.pxl.ja.streamingservice.model.Rating;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MovieIsLongPlayingTimeTest {
    private Movie movie;

    @BeforeEach
    public void init(){
        movie = new Movie("Titanic", Rating.OLDER_KIDS);
    }

    @Test
    public void returnsFalseIfDurationLessThanLongPlayingTime(){
        // ARRANGE
        movie.setDuration(Movie.LONG_PLAYING_TIME - 1);

        // ACT
        boolean result = movie.isLongPlayingTime();

        // ASSERTS
        assertFalse(result);
    }

    @Test
    public void returnsTrueIfDurationMoreThanLongPlayingTime() {
        movie.setDuration(Movie.LONG_PLAYING_TIME + 1);

        assertTrue(movie.isLongPlayingTime());
    }

    @Test
    public void returnTrueIfDurationExactlyLongPlayingTime(){
        movie.setDuration(Movie.LONG_PLAYING_TIME);

        assertTrue(movie.isLongPlayingTime());
    }

}
