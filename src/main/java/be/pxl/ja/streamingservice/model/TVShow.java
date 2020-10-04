package be.pxl.ja.streamingservice.model;

public class TVShow extends be.pxl.ja.opdracht1.Content {
    private int numberOfSeasons;

    public TVShow(String title, be.pxl.ja.opdracht1.Rating rating, int seasons) {
        super(title, rating);
        this.numberOfSeasons = seasons;
    }

    public int getNumberOfSeasons() {
        return numberOfSeasons;
    }
}
