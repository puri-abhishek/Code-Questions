class Solution {
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<List<Integer>> arr = new ArrayList<>();
        boolean vis[] = new boolean[graph.length];
        dfs(graph, 0, graph.length - 1, new ArrayList<>(), arr, vis);
        return arr;
    }
    
    void dfs(int[][] graph, int currentNode, int targetNode, List<Integer> currentPath, List<List<Integer>> result, boolean[] visited) 
    {
        if (currentNode == targetNode)
        {
            currentPath.add(targetNode);
            result.add(new ArrayList<>(currentPath));
        } 
        else 
        {
            currentPath.add(currentNode);
            visited[currentNode] = true;

            for (int neighbor : graph[currentNode]) 
            {
                if (!visited[neighbor]) 
                {
                    dfs(graph, neighbor, targetNode, currentPath, result, visited);
                }
            }
        }

        visited[currentNode] = false;
        currentPath.remove(currentPath.size() - 1);
    }
}