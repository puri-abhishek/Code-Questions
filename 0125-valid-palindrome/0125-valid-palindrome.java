/* failed attempt(check again later)
class Solution {
    public boolean isPalindrome(String s) {
        s.toLowerCase();
        s = s.replaceAll("^[a-zA-Z]", "");
        StringBuilder S = new StringBuilder();
        S.append(s);
        S.reverse();
        if(S.equals(s))
            return true;
        else
            return false;
    }
}
*/

class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j = s.length()-1;
        while(i<j){
            Character first = s.charAt(i);
            Character last = s.charAt(j);

            if(!Character.isLetterOrDigit(first)){
                i++;
                continue;
            }
            if(!Character.isLetterOrDigit(last)){
                j--;
                continue;
            }

            if(Character.toLowerCase(first)!=Character.toLowerCase(last)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}