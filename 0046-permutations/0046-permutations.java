class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        permute(arr, new ArrayList<>(), nums);
        return arr;
    }
    
    public void permute(List<List<Integer>> arr, List<Integer> tempArr, int nums[]){
        if(tempArr.size() == nums.length)
            arr.add(new ArrayList<>(tempArr));
        else
            for(int i = 0; i < nums.length; i++)
            {
                if(tempArr.contains(nums[i]))
                    continue;
                else
                    tempArr.add(nums[i]);
                    permute(arr, tempArr, nums);
                    tempArr.remove(tempArr.size() - 1);  
            }
    }
}