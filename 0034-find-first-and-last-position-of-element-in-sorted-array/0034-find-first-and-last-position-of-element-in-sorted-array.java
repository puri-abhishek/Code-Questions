class Solution {
    public int[] searchRange(int[] nums, int target) {
        int arr[] = new int[2];
        arr[0] = -1;
        arr[1] = -1;
        int f = -1, l = -1;
        for(int i = 0; i < nums.length; i++){
            if(target == nums[i]){
                if(f == -1){
                    arr[0] = i ;
                    f++;
                }
                else{
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