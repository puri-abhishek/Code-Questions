/*class Solution {
    public int maxOperations(int[] nums, int k) {
          int count = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == k){
                    count++;
                    break;
                }
                else
                    continue;
            }
        }
        return count;
    }
}
*/
class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
        int count = 0;
        int i = 0;
        int j = nums.length - 1;
        while(i < j){
            int sum = nums[i] + nums[j];
            if(sum == k) {
                count++;
                i++;
                j--;
            }
            else if(sum > k) 
                j--;
            else 
                i++;
        }
        return count;
    }
}