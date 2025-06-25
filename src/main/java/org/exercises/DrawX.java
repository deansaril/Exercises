package org.exercises;

/**
 * Problem: Draw X
 *
 * Description:
 * Print a capital letter 'X' using asterisks (*) for a given size.
 * The size will always be an odd positive integer ≥ 3.
 *
 * Input:
 * A single odd integer n (3 ≤ n ≤ 99), representing the height and width of the 'X'.
 *
 * Output:
 * An 'X' shape drawn with asterisks (*) and spaces, with n rows and n columns.
 * Each row contains exactly one asterisk on the left diagonal and one on the right.
 *
 * Example:
 * Input: 5
 * Output:
 * *   *
 *  * *
 *   *
 *  * *
 * *   *
 *
 */
public class DrawX {
    public static String drawX(int size)
    {
        StringBuilder sb = new StringBuilder();
        for (int row = 0; row < size; row++)
        {
            for (int col = 0; col < size; col++)
            {
                // First condition draws the backslash part of the X while the second condition draws the forward slash
                if (row == col || col == size - 1 - row)
                {
                    sb.append('*');
                }
                else
                {
                    sb.append(' ');
                }
            }
            sb.append('\n');
        }
        return sb.toString();
    }
}
