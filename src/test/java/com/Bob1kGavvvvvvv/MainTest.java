package com.Bob1kGavvvvvvv;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import static org.junit.Assert.*;
public class MainTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void leetCodeNum1() {
        assertTrue("Failed for palindrome", Main.isPalindrome(121));
        assertFalse("Failed for non-palindrome", Main.isPalindrome(123));
        assertTrue("Failed for palindrome", Main.isPalindrome(1221));
        assertFalse("Failed for non-palindrome", Main.isPalindrome(12345));
        assertTrue("Failed for palindrome", Main.isPalindrome(12321));
    }

    @Test
    public void isPalindrome() {
        // Placeholder for a specific test related to isPalindrome, if needed.
    }

    @Test
    public void delNum() {
        int[] originalArray = {4, 5, 7, 8, 10, 9};
        int[] newArray = Main.removeNumberFromArray(originalArray, 8);
        assertArrayEquals("Failed to remove element from array", new int[]{4, 5, 7 ,10, 9}, newArray);

        int[] newArray2 = Main.removeNumberFromArray(originalArray, 11);
        assertArrayEquals("Failed for non-existent element", originalArray, newArray2);

        int[] emptyArray = {};
        int[] newArray3 = Main.removeNumberFromArray(emptyArray, 5);
        assertArrayEquals("Failed for empty array", emptyArray, newArray3);
    }

    @Test
    public void sqrt() {
        assertEquals("Failed for square root", 0, Main.sqrt(6.5), 0.000001);
    }
}