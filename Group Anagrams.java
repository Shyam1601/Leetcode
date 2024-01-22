/*49. Group Anagrams
Solved
Medium
Topics
Companies
Given an array of strings strs, group the anagrams together. You can return the answer in any order.

An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

 

Example 1:

Input: strs = ["eat","tea","tan","ate","nat","bat"]
Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
Example 2:

Input: strs = [""]
Output: [[""]]
Example 3:

Input: strs = ["a"]
Output: [["a"]]
 

Constraints:

1 <= strs.length <= 104
0 <= strs[i].length <= 100
strs[i] consists of lowercase English letters.*/

//Code:-

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String,List<String>> m=new HashMap<>();

        for(String str: strs){
            String temp=Freq(str);

            if(m.containsKey(temp)){
                m.get(temp).add(str);
            }
            else{
                List<String> l=new ArrayList<>();
                l.add(str);
                m.put(temp,l);
            }

        }
    return new ArrayList<>(m.values());
    }

    private String Freq(String str){
        int[] count=new int[26];
        char c='a';
        for(char ch:str.toCharArray()){
            count[ch-'a']++;
        }
        StringBuilder s=new StringBuilder();
        for(int i: count){
            s.append(c).append(i);
            c++;
        }
        return s.toString();
    }
}
