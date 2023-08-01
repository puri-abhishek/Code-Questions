class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> arr = new ArrayList<>();
        boolean[] checked = new boolean[nums.length];
        Arrays.sort(nums);
        perm2(arr, new ArrayList<>(), nums, checked);
        return arr;
    }
    
    public void perm2(List<List<Integer>> arr, List<Integer> tempArr, int[] nums, boolean[] checked)
    {
        if(tempArr.size() == nums.length){
            arr.add(new ArrayList<>(tempArr));
            return;
        }
        for(int i = 0; i < nums.length; i++)
        {
            if(checked[i])
                continue;
            if(i > 0 && nums[i - 1] == nums[i] && checked[i - 1])
                continue;
            checked[i] = true;
            tempArr.add(nums[i]);
            perm2(arr, tempArr, nums, checked);
            checked[i] = false;
            tempArr.remove(tempArr.size() - 1);
        }
    }
}