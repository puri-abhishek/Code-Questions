/*
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[] = {-1, -1};
        int f = -1, l = -1;
        for(int i = 0; i < nums.length; i++){
            if(target == nums[i]){
                if(f == -1) {
                    arr[0] = i ;
                    f++;
                }
                else {
                    arr[1] = i;
                    l++;
                } 
            }         
        }
        if(f != -1 && l == -1)
            arr[1] = arr[0];
        return arr;
    }
}
*/
class Solution {
    public int[] searchRange(int[] nums, int target) {
          int[] arr = {-1, -1};
        int start = 0, end = nums.length - 1;
        
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                arr[0] = mid;
                end = mid - 1;
            } 
            else if (target < nums[mid]) {
                end = mid - 1;
            } 
            else if (target > nums[mid]) {
                start = mid + 1;
            }
        }
 
        start = 0;
        end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == nums[mid]) {
                arr[1] = mid;
                start = mid + 1;
            } 
            else if (target < nums[mid]) {
                end = mid - 1;
            } 
            else if (target > nums[mid]) {
                start = mid + 1;
            }
        }
        return arr;
    }
}