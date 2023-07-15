class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length <= 1)
            return (double)nums[0];
        double sum = 0;
        double avg = 0;
        
        for(int i = 0; i < k; i++){
            sum = sum + nums[i];
        }
        avg = sum / k;
        
        for(int i = k; i < nums.length; i++){
            sum = sum + nums[i];
            sum = sum - nums[i - k];
            avg = Math.max(avg, sum / k);
        }
        return avg;
    }
}