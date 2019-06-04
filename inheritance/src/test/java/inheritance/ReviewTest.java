package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReviewTest {
    @Test
    public void ReviewInstanceTest(){
        Restaurant BurgerKing = new Restaurant("BurgerKing", 4, "$$");
        Review classUnderTest = new Review("The place is very clean", "AnthonyB", 5);



        assertEquals("AnthonyB, 5 out of 5 Stars, The place is very clean for The Restaurant BurgerKing has 4 stars with a price category of $$.", classUnderTest.toString());
    }

}