class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0 ; i<nums.length ; i++ ){
            
            int c = target-nums[i];
            if(hm.containsKey(c)){
             return new int[] {
                 i,hm.get(c)
             };   
            }
            hm.put(nums[i],i);
        }
        return new int[]{};
    }
}
