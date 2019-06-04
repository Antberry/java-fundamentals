package inheritance;

public class Review {
    private String body;
    private String author;
    private int stars;

    public String getBody() {
        return body;
    }

    public int getStars() {
        return stars;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public Review (String body, String author, int stars){
        this.body = body;
        this.author = author;
        this.stars = stars;
    }


    public String toString(){
        return String.format("%s, %d out of 5 Stars, %s." ,this.author, this.stars, this.body);
    }
}
