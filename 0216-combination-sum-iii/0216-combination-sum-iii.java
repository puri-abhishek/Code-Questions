class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> arr = new ArrayList<>();
        combo3(arr, new ArrayList<>(), n, k, 1);
        return arr;
    }
    
    public void combo3(List<List<Integer>> arr, List<Integer> tempArr, int n, int k, int index)
    {
        if(tempArr.size() > k)
        {
            return;
        }
        if(tempArr.size() == k && n == 0)
        {
            arr.add(new ArrayList<>(tempArr));
            return;
        }
        for(int i = index; i <= 9; i++)
        {
           if(n - i >= 0 )
           {
                tempArr.add(i);
                combo3(arr, tempArr, n - i, k, i + 1);
                tempArr.remove(tempArr.size() - 1); 
           } 
        }
    }
}