/*739. Daily Temperatures
Given an array of integers temperatures represents the daily temperatures, return an array answer such that answer[i] is the number of days you have to wait after the ith day to get a warmer temperature. If there is no future day for which this is possible, keep answer[i] == 0 instead.

 

Example 1:

Input: temperatures = [73,74,75,71,69,72,76,73]
Output: [1,1,4,2,1,1,0,0]
Example 2:

Input: temperatures = [30,40,50,60]
Output: [1,1,1,0]
Example 3:

Input: temperatures = [30,60,90]
Output: [1,1,0]
 

Constraints:

1 <= temperatures.length <= 105
30 <= temperatures[i] <= 100
  */

//Code:-
class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans=new int[temperatures.length];

        for(int i=0;i<ans.length-1;i++){
            int j=i+1,c=0;
            while(j<temperatures.length  ){
                if(temperatures[i]<temperatures[j]) {
                    c++;
                    ans[i]=c;
                    c=0;
                    break;
                }
                else{
                    c++;
                }
                j++;
            }
           //ans[i]= (j==temperatures.length)? 0 : j-i;
        }
        return ans;
    }
}
