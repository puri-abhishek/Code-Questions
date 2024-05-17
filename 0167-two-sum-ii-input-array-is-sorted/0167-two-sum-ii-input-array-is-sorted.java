class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        int total = 0;
        
        while(l < r){
            total = numbers[l] + numbers[r];
            
            if(total == target){
                return new int[]{l + 1, r + 1};
            }
            if(target > total){
                l ++;
            }
            else{
                r --;
            }
        }
        return new int[]{-1, -1};
    }
}