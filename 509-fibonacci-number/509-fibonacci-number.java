class Solution {
    public int fib(int n) {
       int a[] = new int[n+1];
        for(int i = 0 ; i<=n ; i++){
            a[i] = -1;
        }
        return fibo(n,a);
    }
    public int fibo(int n,int arr[]){
         if(n==0)
            return 0;
        if(n==1)
            return 1;
        if(arr[n] == -1)
        arr[n] = fibo(n-1,arr) + fibo(n-2,arr);
     return arr[n];
        
    }
}