/*283. Move Zeroes

Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Note that you must do this in-place without making a copy of the array.

 

Example 1:

Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0]
Example 2:

Input: nums = [0]
Output: [0]
 

Constraints:

1 <= nums.length <= 104
-231 <= nums[i] <= 231 - 1iter
*/

//Code:-

class Solution {
    public void moveZeroes(int[] nums) {
        if(nums.length==1 || nums.length==0) return;
        int i=0,j=0;
        while(j<nums.length){     //j pointer will iterate through the array and i is used for placing
          if(nums[j]!=0) {          //if 0 is  found then we swap the i and j elements, i is incremented
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
                i++;
            }
            j++;    //j is incremented everytime as it is used for iteration.
        }
    }
}
