// class Solution {
//     public boolean containsNearbyDuplicate(int[] nums, int k) {
//         int n=nums.length;
//         for(int i=0;i<n;i++){
//             for(int j=i+1;j<n && j<=i+k;j++){
//                  if(nums[i]==nums[j]){
//                      return true;
//                 }
//              }
//         }
//         return false;
    
//     }
// }
//------------------------------[HashMap]-----------------------------//

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n=nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(nums[i])){
                if(i-map.get(nums[i])<=k){
                    return true;
                }
            }
            map.put(nums[i],i);
        }
        return false;
    }
}