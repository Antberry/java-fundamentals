package inheritance;

import java.util.List;

public class Theater {
    private String name;
    private String movieName;
    private List<String> moviesShowing;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getMoviesShowing() {
        return moviesShowing;
    }

    public void setMoviesShowing(List<String> moviesShowing) {
        this.moviesShowing = moviesShowing;
    }

    public Theater(String name, String movieName){
        this.name = name;
        this.movieName = movieName;
    }
}
