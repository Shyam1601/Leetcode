/*3. Longest Substring Without Repeating Characters
Solved
Medium
Topics
Companies
Given a string s, find the length of the longest 
substring
 without repeating characters.

 

Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.
Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.
Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 

Constraints:

0 <= s.length <= 5 * 104
s consists of English letters, digits, symbols and spaces.*/

//Code:
class Solution {
    public int lengthOfLongestSubstring(String st) {
        int i=0,j=0,max=0; //i=start pointer,j=end pointer,max=max length of subsequence.
        Set<Character> s=new HashSet<>(); // using set because it do not allow repetitions/duplicates.

        while(j<st.length()){
            if(!s.contains(st.charAt(j))){ //if the character is not present in the set, we add and move the end pointer(j).
                s.add(st.charAt(j));
                j++;
                max=Math.max(max,s.size()); //updating the max each and every iteration
            }
            else{
                s.remove(st.charAt(i));  //if the character is found in the set,then we simply remove from set and move the start pointer(i).
                i++;
            }
        }
        return max;
    }
}
