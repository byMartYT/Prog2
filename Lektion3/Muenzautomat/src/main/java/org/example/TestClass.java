package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestClass {

    Main main = new Main();

    @Test
    public void testError() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> main.getChange(-2,0));

        String expectedMessage = "Weder Cent noch Euro darf negativ sein";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
    }

    @Test
    public void testOne() {
        int[] test = new int[]{1,0,0,0,1,0,1,0};
        assertArrayEquals(test, main.getChange(1,21));
    }
    @Test
    public void testTwo() {
        int[] test = new int[]{0,2,1,0,2,1,0,1};
        assertArrayEquals(test, main.getChange(2,99));
    }
    @Test
    public void testThree() {
        int[] test = new int[]{0,1,1,0,0,1,0,5};
        assertArrayEquals(test, main.getChange(10,57));
    }

}
