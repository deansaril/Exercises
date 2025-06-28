package org.exercises;

/**
 * Problem: Is Palindrome
 *
 * Description:
 * Create a function that checks whether a string is a palindrome. A palindrome is a word or
 * a string that is spelt the same as it is in reverse.
 *
 * Input:
 * A string, containing alphanumeric characters
 *
 * Output:
 * A boolean value that states whether the string is a palindrome.
 *
 * Example 1 (Palindrome input):
 * Input: racecar
 * Output: true
 * Explanation: racecar spelt backwards is also racecar
 *
 * Example 2 (Non-palindrome input):
 * Input: sedan
 * Output: false
 * Explanation: sedan spelt backwards is nades.
 *
 *
 *
 */
public class IsPalindrome {

   public static boolean isPalindrome (String word)
   {
       int front = 0;
       int back = word.length() - 1;

       while (front < back)
       {
           if (word.charAt(front) != word.charAt(back))
           {
               return false;
           }

           front++;
           back--;
       }

       return true;
   }
}
