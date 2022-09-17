class Solution {
    public int removeDuplicates(int[] nums) {
       int flag=1,i=0,j=0;
        while(i<nums.length-1){
            j=i+1;
            if(nums[i]!=nums[j]){
                nums[flag] = nums[j];
                flag++;
            }
            i++;
        }
        return flag;
    }
}