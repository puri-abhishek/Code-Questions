class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        if(n < 2)
            return;
        
        int prev = n - 2, curr = n - 1;
        while(prev >= 0)
        {
            if(nums[curr] > nums[prev])
                break;
            prev--;
            curr--;
        }
        if(prev >= 0)
        {
            int replaceInd = n - 1;
            while(replaceInd > 0)
            {
                if(nums[replaceInd] > nums[prev])
                    break;
                replaceInd--;
            }
            swap(nums, replaceInd, prev);
        }
        reverse(nums, curr, n - 1);
    }
    
    public void swap(int[] nums, int a, int b)
    {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
    public void reverse(int[] nums, int first, int last)
    {
        while(first < last)
        {
            swap(nums, first, last);
            first++;
            last--;
        } 
    }
}