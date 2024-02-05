class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        if(n == 1)
            return intervals;
        
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        Stack<int[]> stack = new Stack<>();
        
        stack.add(intervals[0]);
        
        for(int i = 1; i < n; i++){
            int prev[] = stack.peek();
            int curr[] = intervals[i];
            
            if(prev[1] < curr[0])
                stack.add(curr);
            else
                prev[1] = Math.max(prev[1], curr[1]);
            
        }
        return stack.toArray(new int[stack.size()][2]);
    }
}