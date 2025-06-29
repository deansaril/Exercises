package org.exercises;

import java.util.HashMap;
import java.util.Map;

/**
 * Problem: Two Sum
 *
 * Description:
 * Create a function that takes an array of integers and a target sum. The function should return
 * the indices of the two numbers in the array that add up to the target. Assume that there is
 * exactly one valid solution, and the same element cannot be used twice.
 *
 * Input:
 * An array of integers and an integer target value.
 *
 * Output:
 * An array containing two integers representing the indices of the numbers that add up to the target.
 *
 * Example 1:
 * Input: nums = [2, 7, 11, 15], target = 9
 * Output: [0, 1]
 * Explanation: nums[0] + nums[1] = 2 + 7 = 9
 *
 * Example 2:
 * Input: nums = [3, 2, 4], target = 6
 * Output: [1, 2]
 * Explanation: nums[1] + nums[2] = 2 + 4 = 6
 *
 * Constraints:
 * - Each input has exactly one solution.
 * - Elements cannot be reused.
 *
 */
public class TwoSum {

    public static int[] twoSum(int[] nums, int target)
    {;
        return usingHashMap(nums, target);
    }

    private static int[] bruteForce(int[] nums, int target)
    {
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = i + 1; j < nums.length; j++)
            {
                if (nums[i] + nums[j] == target)
                {
                    return new int[] {i, j};
                }
            }
        }
        return new int[] {};
    }

    private static int[] usingHashMap(int[] nums, int target)
    {
        Map<Integer, Integer> addendToIndexMap = new HashMap<>();

        for(int i = 0; i < nums.length; i++)
        {
            int otherAddend = target - nums[i];

            if(addendToIndexMap.containsKey(otherAddend))
            {
                return new int[] {addendToIndexMap.get(otherAddend), i};
            }

            addendToIndexMap.put(nums[i], i);
        }

        return new int[] {};
    }
}
