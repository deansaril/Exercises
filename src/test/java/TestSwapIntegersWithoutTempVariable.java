import org.exercises.NumberForSwapping;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestSwapIntegersWithoutTempVariable {

    @Test
    public void testSwapPositiveIntegers()
    {
        int ORIGINAL_A = 2;
        int ORIGINAL_B = 3;

        NumberForSwapping a = new NumberForSwapping(ORIGINAL_A);
        NumberForSwapping b = new NumberForSwapping(ORIGINAL_B);

        a.swapIntegers(b);

        assertEquals(ORIGINAL_B, a.getValue());
        assertEquals(ORIGINAL_A, b.getValue());
    }

    @Test
    public void testSwapPositiveAndNegativeIntegers()
    {
        int ORIGINAL_A = 2;
        int ORIGINAL_B = -3;

        NumberForSwapping a = new NumberForSwapping(ORIGINAL_A);
        NumberForSwapping b = new NumberForSwapping(ORIGINAL_B);

        a.swapIntegers(b);

        assertEquals(ORIGINAL_B, a.getValue());
        assertEquals(ORIGINAL_A, b.getValue());

        a.swapIntegers(b);

        assertEquals(ORIGINAL_A, a.getValue());
        assertEquals(ORIGINAL_B, b.getValue());
    }

    @Test
    public void testNegativeIntegers()
    {
        int ORIGINAL_A = -2;
        int ORIGINAL_B = -3;

        NumberForSwapping a = new NumberForSwapping(ORIGINAL_A);
        NumberForSwapping b = new NumberForSwapping(ORIGINAL_B);

        a.swapIntegers(b);

        assertEquals(ORIGINAL_B, a.getValue());
        assertEquals(ORIGINAL_A, b.getValue());
    }

    @Test
    public void testPositiveIntegerAndZero()
    {
        int ORIGINAL_A = 2;
        int ORIGINAL_B = 0;

        NumberForSwapping a = new NumberForSwapping(ORIGINAL_A);
        NumberForSwapping b = new NumberForSwapping(ORIGINAL_B);

        a.swapIntegers(b);

        assertEquals(ORIGINAL_B, a.getValue());
        assertEquals(ORIGINAL_A, b.getValue());
    }
}
