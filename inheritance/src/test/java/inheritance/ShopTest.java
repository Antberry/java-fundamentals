package inheritance;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShopTest {
    @Test
    public void toStringMethodTest(){
        Shop classUnderTest = new Shop("Starbucks", "Nothing Special. When you seen one you seen" +
                " them all.", "$$");
        System.out.println(classUnderTest.toString());
        assertEquals("Starbucks, $$, Nothing Special. When you seen one you seen them all.", classUnderTest.toString());
    }

}