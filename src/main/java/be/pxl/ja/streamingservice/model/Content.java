package be.pxl.ja.streamingservice.model;

public abstract class Content {
    private String title;
    private be.pxl.ja.opdracht1.Rating maturityRating;
    private String imageUrl;

    public Content(String title, be.pxl.ja.opdracht1.Rating rating){
        this.title = title;
        this.maturityRating = rating;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public be.pxl.ja.opdracht1.Rating getMaturityRating() {
        return maturityRating;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    @Override
    public String toString() {
        return title;
    }


}
