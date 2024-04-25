class Solution {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int n = nums.length;
        reverse(nums, 0, n - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
    }
    
    public void reverse(int []nums, int first, int last){
        while(first < last){
            int temp = nums[first];
            nums[first] = nums[last];
            nums[last] = temp;
            first ++;
            last --;
        }
    }
}

// another solution that i tried
//class Solution {
//     public void rotate(int[] nums, int k) {
//         k = k % nums.length;
//         int[] temp = new int[nums.length];

//         for (int i = 0; i < k; i++) {
//             temp[i] = nums[nums.length - k + i];
//         }
//         for (int i = k; i < nums.length; i++) {
//             temp[i] = nums[i - k];
//         }
//         for (int i = 0; i < nums.length; i++) {
//             nums[i] = temp[i];
//         }
//     }
// }