/*238. Product of Array Except Self
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 

Constraints:

2 <= nums.length <= 105
-30 <= nums[i] <= 30
The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.*/

//Code:-
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int pe[] = new int[nums.length];        th
        int su[] = new int [nums.length];
        pe[0] = 1;
        su[nums.length - 1] = 1;
        
        for(int i = 1; i < nums.length; i++) {        // creating a prefix multipications array,for i'th pos the prefix[i] constists of the product of all the elements before,and initial is the same /1. 
            pe[i] = pe[i - 1] * nums[i - 1];
        }
        for(int i = nums.length - 2; i >= 0; i--) {    //creating a suffix muliplications array, for i'th pos the suffix[i] consists of the product of all the elements after(this array is made by reverse iteration).
            su[i] = su[i + 1] * nums[i + 1];
        }
        
        int ans[] = new int[nums.length];
        for(int i=0;i<nums.length;i++) { //now for the final ans,we just need to mulitply the pe and suff at the i'th pos,as pre consists of  products of before elements and suff the after elements.
            ans[i] = pe[i] * su[i];
        }
        return ans;
    }
}
