class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> arr = new ArrayList<>();
        boolean vis[] = new boolean[graph.length];
        dfs(graph, 0, graph.length - 1, new ArrayList<>(), arr, vis);
        return arr;
    }
    
    void dfs(int [][]graph, int index, int length, List<Integer> tempArr, List<List<Integer>> arr, boolean []vis){
        if(index == length){
            tempArr.add(length);
            arr.add(new ArrayList<>(tempArr));
        }
        else{
            tempArr.add(index);
            vis[index] = true;
            for(int node : graph[index]){
                if(vis[node] == false)
                    dfs(graph, node, length, tempArr, arr, vis);
            }
        }
        vis[index] = false;
        tempArr.remove(tempArr.size() - 1);
    }
}