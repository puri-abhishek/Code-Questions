class Solution {
    public boolean canJump(int[] nums) {
        int lastPosi = nums.length - 1;
        for(int i = nums.length - 1; i >= 0; i--){
            if(i + nums[i] >= lastPosi){
                lastPosi = i;
            }
        }
        return lastPosi == 0;
    }
}