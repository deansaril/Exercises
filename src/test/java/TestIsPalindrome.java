import org.exercises.DrawY;
import org.exercises.IsPalindrome;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class TestIsPalindrome {

    @Test
    public void testPalindromeWithOddLength()
    {
        String word = "bob";

        assertTrue(IsPalindrome.isPalindrome(word));
    }

    @Test
    public void testPalindromeWithEvenLength()
    {
        String word = "toot";

        assertTrue(IsPalindrome.isPalindrome(word));
    }

    @Test
    public void testNonPalindromeWithOddLength()
    {
        String word = "fly";

        assertFalse(IsPalindrome.isPalindrome(word));
    }

    @Test
    public void testNonPalindromeWithEvenLength()
    {
        String word = "cars";

        assertFalse(IsPalindrome.isPalindrome(word));
    }
}
