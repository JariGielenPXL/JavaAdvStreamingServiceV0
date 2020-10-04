package be.pxl.ja.streamingservice.util;

import be.pxl.ja.streamingservice.model.Movie;
import be.pxl.ja.streamingservice.model.Rating;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MovieSetDurationTest {
    private Movie movie;

    @BeforeEach
    public void init() {
        movie = new Movie("Titanic", Rating.MATURE);

    }

    @Test
    public void negativeDurationBecomesPositive() {
        movie.setDuration(-125);


        assertEquals(125,movie.getDuration());

    }

    @Test
    public void positiveDurationStaysUnchanged(){
        movie.setDuration(125);

        assertEquals(125,movie.getDuration());
    }
}
