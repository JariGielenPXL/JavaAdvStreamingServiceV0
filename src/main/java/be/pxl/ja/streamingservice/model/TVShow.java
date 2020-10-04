package be.pxl.ja.streamingservice.model;

public class TVShow extends Content {
    private int numberOfSeasons;

    public TVShow(String title, Rating rating, int seasons) {
        super(title, rating);
        this.numberOfSeasons = seasons;
    }

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }
}
