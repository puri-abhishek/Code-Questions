class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> arr = new ArrayList<>();
        subset2(arr, new ArrayList<>(), nums, 0);
        return arr;
    }
    
    public void subset2(List<List<Integer>> arr, List<Integer> tempArr, int[] nums, int index)
    {
        arr.add(new ArrayList<>(tempArr));
        for(int i = index; i < nums.length; i++ ){
            if(i != index && nums[i] == nums[i - 1])
                continue;
            tempArr.add(nums[i]);
            subset2(arr, tempArr, nums, i + 1);
            tempArr.remove(tempArr.size() - 1);
        }
    }
}