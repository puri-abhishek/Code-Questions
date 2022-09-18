class Solution {
    public boolean isPalindrome(int x) {
     
       int rev = 0, temp = x;
        while(temp>0){
            rev = rev * 10 + temp % 10;
            temp = temp / 10;
        }
        if(x == rev){
            return true;
        }
        else {
            return false;
        }
    }
}