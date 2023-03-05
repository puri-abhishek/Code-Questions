//----------------------sum solution----------------------------(may cause integer overflow)
// class Solution {
//     public int missingNumber(int[] nums) {

//             int n=nums.length,totalsum=n*(n+1)/2;
//             for(int i=0 ; i<n ; i++)
//                 totalsum-=nums[i];
//             return totalsum;
//         }
// }

//------------------------XOR Solution----------------------------
class Solution {
    public int missingNumber(int[] nums) {
          int ans = 0, i;
        for(i=0; i<nums.length; i++){
            ans = ans ^ nums[i] ^ (i+1);
        }
        return ans;
    }
}