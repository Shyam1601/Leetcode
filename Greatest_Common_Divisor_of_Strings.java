/*1071. Greatest Common Divisor of Strings

For two strings s and t, we say "t divides s" if and only if s = t + ... + t (i.e., t is concatenated with itself one or more times).

Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.

 

Example 1:

Input: str1 = "ABCABC", str2 = "ABC"
Output: "ABC"
Example 2:

Input: str1 = "ABABAB", str2 = "ABAB"
Output: "AB"
Example 3:

Input: str1 = "LEET", str2 = "CODE"
Output: ""
 

Constraints:

1 <= str1.length, str2.length <= 1000
str1 and str2 consist of English uppercase letters.*/

// Code:-
class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(str2.length()>str1.length()) return gcdOfStrings(str2,str1); //if 2nd string's length is greater than the 1st string's length,then interchange the strings.
        if(str1.equals(str2)) return str1;   // if both ths strings are same then simply return anyone of the strings.
        if(str1.startsWith(str2)) return gcdOfStrings(str1.substring(str2.length()),str2); // if the 1st string is starting the same as the 2nd string then call the same function with updating the 1st sting as the substring with the 2nd sting's length and 2nd string.

        return "";       // if no condition is followed then we simply return empty string.
    }
}
