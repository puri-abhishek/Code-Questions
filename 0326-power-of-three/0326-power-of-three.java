//-------------------USING RECURSION----------------------------
/*
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1)
            return true;
        else if(n%3 != 0 || n <= 0)
            return false;
        return isPowerOfThree(n/3);
        
    }
}
*/
//----------------------------USING WHILE-------------------------
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n<=0)
            return false;
        else{
            while(n%3 == 0)
                n = n/3;
            if(n == 1)
                return true;
            
        }
        return false;
    }
}