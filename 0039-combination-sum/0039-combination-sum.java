class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> arr = new ArrayList<>();
        combo(arr, new ArrayList<>(), candidates, target, 0);
        return arr;
    }
    
    public void combo(List<List<Integer>> arr, List<Integer> tempArr, int[] candidates, int target, int index){
        if(target == 0)
        {
            arr.add(new ArrayList<>(tempArr));
            return;
        }
        for(int i = index; i < candidates.length; i++)
        {
            if(target - candidates[i] >= 0)
            {
                tempArr.add(candidates[i]);
                combo(arr, tempArr, candidates, target - candidates[i], i);
                tempArr.remove(tempArr.size() - 1);
            }
        }
    }
}