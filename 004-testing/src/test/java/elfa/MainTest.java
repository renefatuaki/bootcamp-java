package elfa;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    //    Write a test for a method that calculates the sum of two integers.
    @Test
    void sum_whenAdditionWith5And10_Return15() {
        assertEquals(15, Main.sum(5, 10));
    }

    //    Write a test for a method that checks if a given number is even.
    @Test
    void isEven_whenCheck4_ReturnTrue() {
        assertTrue(Main.isEven(4));
    }

    @Test
    void isEven_whenCheck3_ReturnFalse() {
        assertFalse(Main.isEven(3));
    }

    @Test
    void multiple_whenMultiple5and10_Return50() {
        assertEquals(50, Main.multiple(5, 10));
    }

    @Test
    void multiple_whenMultiple5and0_Return0() {
        assertEquals(0, Main.multiple(5, 0));
    }

    //    Write a test for a method that converts a given string to uppercase.
    @Test
    void toUppercase_whenArgumentIsHello_ReturnHELLO() {
        assertEquals("HELLO", Main.toUppercase("Hello"));
    }

    //    Write a test for a method that checks if a given number is positive.
    @Test
    void isPositive_WhenNumberIs10_ReturnTrue() {
        assertTrue(Main.isPositive(10));
    }

    @Test
    void isPositive_WhenNumberIsMinus10_ReturnFalse() {
        assertFalse(Main.isPositive(-10));
    }
}