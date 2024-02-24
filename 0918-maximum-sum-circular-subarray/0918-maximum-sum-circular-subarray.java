class Solution {
    /* <some problem on this one>
    public int maxSubarraySumCircular(int[] nums) {
        int total = 0, maxSum = 0, minSum = 0, curMax = 0, curMin = 0;
        
        for(int i = 0; i < nums.length; i++){
            curMax = Math.max(curMax + nums[i], nums[i]);
            maxSum = Math.max(curMax, maxSum);
            curMin = Math.max(curMin + nums[i], nums[i]);
            minSum = Math.max(curMin, minSum);
            total += nums[i];
        }
        if(maxSum > 0)
            return Math.max(maxSum, total - minSum);
        else
            return maxSum;
    } */
     public int maxSubarraySumCircular(int[] A) {
        int total = 0, maxSum = A[0], curMax = 0, minSum = A[0], curMin = 0;
        for (int a : A) {
            curMax = Math.max(curMax + a, a);
            maxSum = Math.max(maxSum, curMax);
            curMin = Math.min(curMin + a, a);
            minSum = Math.min(minSum, curMin);
            total += a;
        }
        return maxSum > 0 ? Math.max(maxSum, total - minSum) : maxSum;
    }
}