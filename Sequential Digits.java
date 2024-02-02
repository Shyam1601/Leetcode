/*1291. Sequential Digits

An integer has sequential digits if and only if each digit in the number is one more than the previous digit.

Return a sorted list of all the integers in the range [low, high] inclusive that have sequential digits.

 

Example 1:

Input: low = 100, high = 300
Output: [123,234]
Example 2:

Input: low = 1000, high = 13000
Output: [1234,2345,3456,4567,5678,6789,12345]
 

Constraints:

10 <= low <= high <= 10^9

  */

//Code:-
class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ans=new ArrayList<>();

        for(int i=1;i<10;i++){
            int n=i,nxt=i+1;
            while(n<=high && nxt<10){
                n=n*10+nxt;
                if(n>=low  && n<=high) ans.add(n);
                nxt++;
            }
        }
        ans.sort(null);
        return ans;
    }
}
