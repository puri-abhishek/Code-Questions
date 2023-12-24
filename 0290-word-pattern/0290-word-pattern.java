class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] P = pattern.split("");
        String[] S = s.split(" ");
        
        if(P.length != S.length){
            return false;
        }
        
        HashMap<String,String> hm = new HashMap<>();
        
        for(int i = 0; i < P.length; i++){
            if(!hm.containsKey(P[i])){
                if(!hm.containsValue(S[i])){
                    hm.put(P[i], S[i]);
                }
                else{
                    return false;
                }
            }
            else{
                String value = hm.get(P[i]);
                if(!value.equals(S[i])){
                    return false;
                }
            }
        }
        return true;  
    }
}