class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        subseq(arr, new ArrayList<>(), nums, 0);
        return arr;
    }
    
    public void subseq(List<List<Integer>> arr , List<Integer> tempArr, int [] nums, int i){
        if(arr.contains(tempArr))
            return;
        if(i == nums.length)
        {
            arr.add(new ArrayList<>(tempArr));
            return;
        }
        tempArr.add(nums[i]);
        subseq(arr, tempArr, nums, i + 1);
        tempArr.remove(tempArr.size() - 1);
        subseq(arr, tempArr, nums, i + 1);
    }
}
