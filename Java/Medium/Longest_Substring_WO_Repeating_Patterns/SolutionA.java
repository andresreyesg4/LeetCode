package Java.Medium.Longest_Substring_WO_Repeating_Patterns;

import java.util.Set;

public class SolutionA {
    /**
     * Problem: Return the longest substring with non-repeating characters.
     * Example: 
     *  Input: abcabccc
     *  Answer: abc
     *  Output: 3
     *  Explanation: From the input, the substring 'abc' is the longest substring which does not repeat characters. 
     * 
     *  Second Example
     *  Input: pwwkew
     *  Answer: wke
     *  Output: 3
     *  Explanation: Since the substring 'pww' contains repeating character, we drop the 'pw' and start off wit
     *               the third character 'w'. From there, we add 'k' + 'e' and stop as soon as we see another 'w'.
     *               
     *               In this case, our list of possible answers should include:
     *                  1. pw
     *                  2. wke
     *                  3. kew
     *               Since the first longest substring is 'wke', that is the answer. The algorithm should choose the
     *               a different substring only if it is longer than the previous longest. The output should only be the
     *               the value of the length (int) so both 'wke' and 'kew' are 3. Therefore, the output should still be 3.
     *  
     * Approach: For this problem, we need to consider the data structure needed to store our potential answers. 
     *           As we iterate through the string, we need to calculate the longest substring without duplicate characters.
     *           Store all possible solutions, mark the first new max length substring until a new max is found. 
     *           
     *           The best datastructure for this would be an array-list to act as a slding window. As we begin iterating
     *           the input string, we begin with a sliding window of 1. If the next character is different, increase its size
     *           by 1. As soon as you hit a duplicate character, save the current substring lenth to a 'length' variable as the
     *           the new longest. To begin a new window, drop the first index of the window and start at the second index.
     *           Return the length of the substring. 
     */
    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        return length;
    }

}
