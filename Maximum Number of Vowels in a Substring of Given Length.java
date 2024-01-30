/*1456. Maximum Number of Vowels in a Substring of Given Length

Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.

Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.

 

Example 1:

Input: s = "abciiidef", k = 3
Output: 3
Explanation: The substring "iii" contains 3 vowel letters.
Example 2:

Input: s = "aeiou", k = 2
Output: 2
Explanation: Any substring of length 2 contains 2 vowels.
Example 3:

Input: s = "leetcode", k = 3
Output: 2
Explanation: "lee", "eet" and "ode" contain 2 vowels.
 

Constraints:

1 <= s.length <= 105
s consists of lowercase English letters.
1 <= k <= s.length
  */

//Code:-

class Solution {
    public boolean Vo(char ch){
        if(ch=='a' ||ch=='o' ||ch=='i' ||ch=='e' ||ch=='u' ) return true;
        return false;
    }
    public int maxVowels(String s, int k) {
        int j=0;
        int max=0;
        while(j<k){
            if(Vo(s.charAt(j))) max++;
            j++;
        }
        int f=max;
        while(j<s.length()){
            if(Vo(s.charAt(j))) max++;
            if(Vo(s.charAt(j-k))) max--;
            f=Math.max(max,f);
            j++;
        }
        return f;
    }
}
