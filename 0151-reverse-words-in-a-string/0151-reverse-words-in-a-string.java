class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        StringBuilder sb = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--){
            int temp = i;
            while(i >= 0 && s.charAt(i) != ' ')
                i--;
            String word = s.substring(i + 1, temp + 1);
            if(word.equals(""))
                continue;
            sb.append(word).append(" ");
        }
        return sb.toString().trim();
    }
}

//< this code has problem with spaces>
// class Solution { 
//     public String reverseWords(String s) {
//         s = s.trim();
//         String arr[] = s.split(" ");
//         StringBuilder sb = new StringBuilder();
//         for(int i = arr.length - 1; i >= 0; i--){
//             sb.append(arr[i]).append(" ");
//         }
//         return sb.toString().trim();
//     }
// }