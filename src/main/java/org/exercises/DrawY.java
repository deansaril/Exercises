package org.exercises;

/**
 * Problem: Draw Y
 *
 * Description:
 * Print a capital letter 'Y' using asterisks (*) for a given size.
 * The size will always be an odd positive integer ≥ 3.
 *
 * Input:
 * A single odd integer n (3 ≤ n ≤ 99), representing the height and width of the 'Y'.
 *
 * Output:
 * An 'Y' shape drawn with asterisks (*) and spaces, with n rows and n columns.
 * Each row contains exactly one asterisk on the left diagonal and one on the right.
 *
 * Example:
 * Input: 5
 * Output:
 * *   *
 *  * *
 *   *
 *   *
 *   *
 *
 */
public class DrawY {
    public static String drawY(int size)
    {
        StringBuilder sb = new StringBuilder();

        for (int row = 0; row < size; row++)
        {
            for (int col = 0; col < size; col++)
            {
                if (row >= size / 2 && col == size / 2)
                {
                    sb.append('*');
                }
                else if (row < size / 2 && (col == row || col == size - 1 - row))
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
