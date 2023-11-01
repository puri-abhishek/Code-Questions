class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
       int start = 0, xtra = 0, total = 0;
        
        for(int i = 0; i < gas.length; i++){
            total += gas[i] - cost[i];
            xtra += gas[i] - cost[i];
            if( xtra < 0){
                xtra = 0;
                start = i + 1;
            }
        }
        return (total < 0) ? -1 : start;
    }
}