package org.exercises;

/**
 * Problem: Draw Z
 *
 * Description:
 * Print a capital letter 'Z' using asterisks (*) for a given size.
 * The size will always be an odd positive integer ≥ 3.
 *
 * Input:
 * A single odd integer n (3 ≤ n ≤ 99), representing the height and width of the 'Z'.
 *
 * Output:
 * An 'Z' shape drawn with asterisks (*) and spaces, with n rows and n columns.
 *
 * Example:
 * Input: 5
 * Output:
 * *****
 *    *
 *   *
 *  *
 * *****
 *
 */
public class DrawZ {
    public static String drawZ(int size)
    {
        StringBuilder sb = new StringBuilder();

        for (int row = 0; row < size; row++)
        {
            for (int col = 0; col < size; col++)
            {
                if(row == 0 || row == size - 1)
                {
                    sb.append('*');
                }
                else if (col == size - 1 - row)
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
