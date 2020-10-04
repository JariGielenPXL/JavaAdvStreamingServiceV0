package be.pxl.ja.streamingservice.util;

import be.pxl.ja.streamingservice.model.Content;
import be.pxl.ja.streamingservice.model.Movie;
import be.pxl.ja.streamingservice.model.Profile;
import be.pxl.ja.streamingservice.model.Rating;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class AllowedToWatchTest {
    private Profile profile;
    private Movie movie;


    @Test
    public void returnsFalseWhenYoungerThanMinimumAge(){
        profile = new Profile();
        movie = new Movie("Titanic", Rating.MATURE);
        profile.setDateOfBirth(LocalDate.of(2019,1,1));

        assertFalse(profile.allowedToWatch(movie));
    }

    @Test
    public void returnsTrueWhenOlderThanMinimumAge(){
        profile = new Profile();
        movie = new Movie("Looney Tunes", Rating.LITTLE_KIDS);
        profile.setDateOfBirth(LocalDate.of(1999,1,1));

        assertTrue(profile.allowedToWatch(movie));

    }

}
