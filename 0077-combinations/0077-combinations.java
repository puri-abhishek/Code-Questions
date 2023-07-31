class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> arr = new ArrayList<>();
        combi(arr, new ArrayList<>(), n, k, 1);
        return arr;
    }
    
    public void combi(List<List<Integer>> arr, ArrayList<Integer> tempArr, int n, int k, int index)
    {
        if(tempArr.size() == k)
        {
        arr.add(new ArrayList<>(tempArr));
        return;
        }
        for(int i = index; i <= n; i++)
        {
        tempArr.add(i);
        combi(arr, tempArr, n, k, i + 1);
        tempArr.remove(tempArr.size() - 1);
        }
    }
}