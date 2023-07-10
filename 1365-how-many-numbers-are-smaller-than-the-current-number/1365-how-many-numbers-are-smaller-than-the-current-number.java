class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        
        int arr[] = new int[nums.length];
        int count = 0, i, j;
        
        for(i=0; i<nums.length; i++){
            for(j=0; j<nums.length; j++){
                if(nums[i] > nums[j])
                    count++;
            }
            arr[i] = count;
            count = 0;
        }
        return arr;
    }
}