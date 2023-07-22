class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 0, r = Integer.MIN_VALUE, ans = r;
        
        for(int a : piles)
        {
            r = Math.max(r,a);
        }
        
        while (l < r)
        {
            int mid = l + (r - l)/2;
            if(EatingHours(piles, mid) > h)
                l = mid + 1;
            else
                r = mid;
            
        }
        return l;
    }
    
    public int EatingHours(int[] piles, int k)
    {
        int h = 0;
        for(int a : piles)
        {
            h +=  Math.ceil((double)a / k);
        }
        return h;
    }
}