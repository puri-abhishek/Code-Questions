class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> al = new ArrayList<>();
        for(int i = 1; i <= n; i++){
            if(i % 3 == 0 && i % 5 == 0){
                al.add("FizzBuzz");
                continue;
            }
            if( i % 3 == 0){
                al.add("Fizz");
                continue;
            }
            if(i % 5 == 0){
                al.add("Buzz");
                continue;
            }  
            else
                al.add(Integer.toString(i));
        }
        return al;
    }
}