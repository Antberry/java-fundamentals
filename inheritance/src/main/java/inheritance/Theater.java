package inheritance;

import java.util.HashSet;
import java.util.List;

public class Theater {
    private String name;
    private HashSet<String> moviesShowing;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashSet<String> getMoviesShowing() {
        return moviesShowing;
    }

    public void setMoviesShowing(HashSet<String> moviesShowing) {
        this.moviesShowing = moviesShowing;
    }

    public Theater(String name, HashSet<String> moviesShowing){
        this.name = name;
        this.moviesShowing = moviesShowing;
    }

    public HashSet<String>removeMovie(String movieName){
        moviesShowing.remove(movieName);
        return moviesShowing;
    }

    public HashSet<String> addMovie(String movieName){
        moviesShowing.add(movieName);
        return moviesShowing;
    }

    public String toString(){
        return String.format("%s; has %s showing", this.name, this.moviesShowing);
    }

}
