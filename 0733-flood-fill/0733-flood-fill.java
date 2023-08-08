class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color)
            return image;
        flood(image, sr, sc, color, image[sr][sc]);
        return image;
        
    }
    public void flood(int[][] image, int sr, int sc, int color, int color_og)
    {
        if( sr < 0 || sr >= image.length || sc < 0 || sc >= image[0].length || image[sr][sc] != color_og )
            return;
        else
            image[sr][sc] = color;
        flood(image, sr + 1, sc, color, color_og);
        flood(image, sr - 1, sc, color, color_og);
        flood(image, sr, sc + 1, color, color_og);
        flood(image, sr, sc - 1, color, color_og);
    }
}