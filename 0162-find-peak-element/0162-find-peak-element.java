class Solution {
    public int findPeakElement(int[] nums) {
         int max = nums[0];
        int max_index = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                max_index = i;
            }
        }
        return max_index;
    }
}