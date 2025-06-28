package org.exercises;

/**
 * Problem: Odd-Even Palindrome
 *
 * Description:
 * Create a function that checks whether a string is an odd-even palindrome. An odd-even
 * palindrome is a string where characters at even indices form one palindrome and characters
 * at odd indices form another palindrome.
 *
 * Input:
 * A string, containing alphanumeric characters
 *
 * Output:
 * A boolean value that states whether both the even-indexed and odd-indexed character
 * sequences are palindromes.
 *
 * Example 1 (Both are palindromes):
 * Input: abcdcba
 * Output: true
 * Explanation: Even-indexed characters = "acca", Odd-indexed characters = "bdcb",
 * both are palindromes.
 *
 * Example 2 (Not both are palindromes):
 * Input: abcedf
 * Output: false
 * Explanation: Even-indexed characters = "acef", Odd-indexed characters = "bd",
 * neither is a palindrome.
 *
 */
public class IsOddEvenPalindrome {

   public static boolean isOddEvenPalindrome (String word)
   {
       int even = 0;
       int odd = 1;

       StringBuilder evenString = new StringBuilder();
       StringBuilder oddString = new StringBuilder();

       while (even < word.length())
       {
           evenString.append(word.charAt(even));
           even += 2;
       }

       while (odd < word.length())
       {
           oddString.append(word.charAt(odd));
           odd += 2;
       }

        return IsPalindrome.isPalindrome(evenString.toString())
                && IsPalindrome.isPalindrome(oddString.toString());
   }
}
