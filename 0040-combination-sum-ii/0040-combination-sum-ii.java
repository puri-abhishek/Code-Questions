class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> arr = new ArrayList<>();
        Arrays.sort(candidates);
        combo2(arr, new ArrayList<>(), candidates, target, 0);
        return arr;
    }
    
    public void combo2(List<List<Integer>> arr, List<Integer> tempArr, int[] candidates, int target, int index)
    {
        if(target == 0)
        {
            Collections.sort(tempArr);
            arr.add(new ArrayList<>(tempArr));
            return;
        }
        for(int i = index; i < candidates.length; i++)
        {
            if(i > index && candidates[i] == candidates[i - 1])
                continue;
            if(target - candidates[i] >= 0)
            {
                tempArr.add(candidates[i]);
                combo2(arr, tempArr, candidates, target - candidates[i], i + 1);
                tempArr.remove(tempArr.size() - 1);
            }
        }
    }
}