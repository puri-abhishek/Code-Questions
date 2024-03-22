class Solution {
    public int countSegments(String s) {
        int count = 0;
        boolean check = false;
       for(int i = 0; i < s.length(); i++){
           if(s.charAt(i) != ' '){
               if(!check){
                   count++;
                   check = true;
               }
           }
           else
               check = false;
       }
        return count;
    }
}