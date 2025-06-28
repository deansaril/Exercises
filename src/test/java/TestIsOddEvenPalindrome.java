import org.exercises.IsOddEvenPalindrome;
import org.exercises.IsPalindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class TestIsOddEvenPalindrome {

    @Test
    void testBothPalindromes() {
        String input = "abcdcba"; // Even: acca, Odd: bdb
        assertTrue(IsOddEvenPalindrome.isOddEvenPalindrome(input));
    }

    @Test
    void testNeitherPalindrome() {
        String input = "abcedf"; // Even: acef, Odd: b d
        assertFalse(IsOddEvenPalindrome.isOddEvenPalindrome(input));
    }

    @Test
    void testOnlyEvenPalindrome() {
        String input = "raabccdeefcarg"; // Even: racecar ✅, Odd: abcdefg ❌
        assertFalse(IsOddEvenPalindrome.isOddEvenPalindrome(input));
    }

    @Test
    void testSingleCharacter() {
        String input = "x";
        assertTrue(IsOddEvenPalindrome.isOddEvenPalindrome(input));
    }

    @Test
    void testTwoCharacterPalindrome() {
        String input = "aa"; // Even: a, Odd: a
        assertTrue(IsOddEvenPalindrome.isOddEvenPalindrome(input));
    }
}
