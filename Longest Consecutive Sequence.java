/*128. Longest Consecutive Sequence

Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

 

Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
 

Constraints:

0 <= nums.length <= 105
-109 <= nums[i] <= 109*/

//Code:-

class Solution {
    public int longestConsecutive(int[] nums) {
        //O(n) time and space 
        Map<Integer, Integer> mp = new HashMap<>();
        int currSeq = 0;
        int seq = 0;
        //put all the elems in a hash to be easy to check if elem exists 
        for(int n : nums)
            mp.put(n, mp.getOrDefault(n, 0)+1);
        
        int n = 0;
        for(int i = 0; i < nums.length; i++){
            n = nums[i];
            currSeq = 0;

            if(!(mp.containsKey(nums[i]-1))){//beginning of a sequence
                currSeq++;
                while(mp.containsKey(n+1)){//check if next elem exists in mp
                    currSeq++;//if exists add to the sequence
                    n++;
                }
            }
            seq = Math.max(seq, currSeq);
        }
        return seq;
    }
}
