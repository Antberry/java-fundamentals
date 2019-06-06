package inheritance;

import org.junit.Test;

import java.util.HashSet;

import static org.junit.Assert.*;

public class TheaterTest {
    @Test
    public void ToStringTest(){
        HashSet<String> movies = new HashSet();
        movies.add("Godzilla");
        movies.add("superman");
        Theater theater = new Theater("Regal Cinemas 8", movies);

        System.out.println(theater.toString());
        assertEquals("Regal Cinemas 8; has [Godzilla, superman] showing", theater.toString());
    }

    @Test
    public void AddMovieTest(){
        Theater theater = new Theater("Regal Cinemas 8", new HashSet<String>());
        theater.addMovie("Superman");
        theater.addMovie("Godzilla");
        theater.addMovie("X-men");
        System.out.println(theater.toString());
        assertEquals("Regal Cinemas 8; has [Superman, Godzilla, X-men] showing", theater.toString());
    }

    @Test
    public void RemoveMovieTest(){

        HashSet<String> oldM = new HashSet<String>();
        oldM.add("Superman");
        oldM.add("Godzilla");
        oldM.add("X-men");

        HashSet<String> expected = new HashSet<String>();
        expected.add("Superman");
        expected.add("Godzilla");
        Theater theater = new Theater("Regal Cinemas 8", oldM);

        assertEquals(theater.removeMovie("X-men"), expected );
    }
}