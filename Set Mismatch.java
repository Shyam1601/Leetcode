/*645. Set Mismatch
Solved
Easy
Topics
Companies
You have a set of integers s, which originally contains all the numbers from 1 to n. Unfortunately, due to some error, one of the numbers in s got duplicated to another number in the set, which results in repetition of one number and loss of another number.

You are given an integer array nums representing the data status of this set after the error.

Find the number that occurs twice and the number that is missing and return them in the form of an array.

 

Example 1:

Input: nums = [1,2,2,4]
Output: [2,3]
Example 2:

Input: nums = [1,1]
Output: [1,2]
 

Constraints:

2 <= nums.length <= 104
1 <= nums[i] <= 104*/

//Code:-

class Solution {
    public int[] findErrorNums(int[] nums) {
        int sum1=0,sum2=0;
        Set<Integer> s=new HashSet<>();
        for(int a:nums){
            s.add(a);
            sum1+=a;
        }
        for(int a:s){
            sum2+=a;
        }
        int actual=(nums.length*(nums.length+1))/2;

        return new int[]{sum1-sum2,actual-sum2};
    }
}
