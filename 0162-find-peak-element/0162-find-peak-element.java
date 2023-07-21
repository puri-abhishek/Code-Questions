/*
class Solution {
    public int findPeakElement(int[] nums) {
         int max = nums[0];
        int index = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
                index = i;
            }
        }
        return index;
    }
}
*/

class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length, l = 0, r = n - 1 ;
        if (n == 1) 
            return 0;
        if (n == 2)
        {
            if (nums[1] > nums[0])
                return 1;
            if (nums[0] > nums[1]) 
                return 0;
        }
         while(l <= r)
        {
            int mid = l + (r - l) / 2;
             
            if(mid > 0 && mid < r){
                if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1])
                    return mid;
                else if (nums[mid] > nums[mid - 1]) 
                    l = mid + 1;
                else  
                    r = mid - 1; 
                }
             
            else if(mid == 0)
            {
            if(nums[mid] > nums[mid + 1])
                return 0;
            else 
                l = mid + 1;
            }
             
             else if(mid == r)
             {
             if(nums[mid] > nums[mid - 1])
                 return mid;
             else 
                 r = mid - 1;
            } 
        }
        return -1;
    }
}