class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int count = Integer.MAX_VALUE, sum = 0, l = 0;
        for(int i = 0; i < nums.length; i++)
        {
            sum += nums[i];
            while(sum >= target)
            {
                count = Math.min(count, i - l + 1);
                sum -= nums[l];
                l++;
            }
        }
        if(count != Integer.MAX_VALUE)
        return count;
    else
        return 0;
    }
}