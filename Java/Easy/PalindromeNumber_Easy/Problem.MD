**Palindrome Number
Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.
 

Constraints:

-231 <= x <= 231 - 1

**Solution
A) Convert the number into a character array and iterate starting from the head and tail. Check if the head and tail don't match each time until the index value of the head is greater than the tail. Then we know it is a palindrome, otherwise return false.

B) Instead of converting to a character array. Reverse half the number and compare against the other half to check if they are the same. Extract the end digit of the original number by saving it to a variable through %10. The input number remove the last digit by dividing by 10. Since the remainder is truncated when dealing with int. Keep doing so until the input is less than the reversed half. 