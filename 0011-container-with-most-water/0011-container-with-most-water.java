class Solution {
    public int maxArea(int[] height) {
        int start = 0, end = height.length - 1, res = 0;
       
        while(start < end){
            int w = end - start;
            int h = Math.min(height[start], height[end]);
            int area = w * h;
            res = Math.max(res, area);
            
            if(height[start] < height[end])
                start++;
            else
                end--;
        }
        return res;
    }
}