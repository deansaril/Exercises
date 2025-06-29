import org.exercises.IsOddEvenPalindrome;
import org.exercises.TwoSum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestTwoSum {

    @Test
    public void testTwoSum4Numbers()
    {
        int target = 9;
        int[] nums = new int[] {2, 7, 11, 15};

        int[] expected = new int[] {0, 1};
        assertArrayEquals(expected, TwoSum.twoSum(nums, target));
    }

    @Test
    public void testTwoSum3Numbers()
    {
        int target = 6;
        int[] nums = new int[] {3, 2, 4};

        int[] expected = new int[] {1, 2};
        assertArrayEquals(expected, TwoSum.twoSum(nums, target));
    }

    @Test
    public void testTwoSum2Numbers()
    {
        int target = 6;
        int[] nums = new int[] {3, 3};

        int[] expected = new int[] {0, 1};
        assertArrayEquals(expected, TwoSum.twoSum(nums, target));
    }
}
