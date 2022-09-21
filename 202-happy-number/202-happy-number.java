class Solution {
    public boolean isHappy(int n) {
        int sum = 0;
           while(n != 0){
               sum += (n % 10) * (n % 10);
               n /= 10;
               if(sum > 9 && n == 0 ){
                   n = sum;
                   sum = 0;
               }
           }
               return sum == 1 || sum == 7 ;   
       } 
        
    }
