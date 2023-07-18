class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums1.length; i++ )
            set.add(nums1[i]);
        
        List<Integer> L = new ArrayList<>();
        for(int i = 0; i < nums2.length; i++ ){
            int a = nums2[i];
            if(set.contains(a)){
                L.add(a);
                set.remove(a);
            } 
        }
        int arr[] = new int[L.size()];
         for(int i = 0; i < arr.length; i++ )
             arr[i] = L.get(i);
        
        return arr;
        
    } 
}