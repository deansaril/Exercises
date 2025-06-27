package org.exercises;

/**
 * Problem: Swap two integers without using a temp variable
 *
 * Description:
 * Swap two integer values without using a temp variable.
 *
 * Input:
 * Two integers
 *
 * Output:
 * The value of the two integer variables are swapped
 *
 * Example:
 * Input: A = 5, B = 3
 * Output: A = 3, B = 5
 *
 */
public class NumberForSwapping {

    private int value;

    public NumberForSwapping (int value)
    {
        this.value = value;
    }

    public void swapIntegers (NumberForSwapping otherNumber)
    {
        value = value + otherNumber.value;

        otherNumber.value = value - otherNumber.value;

        value = value - otherNumber.value;
    }

    public int getValue()
    {
        return value;
    }
}
