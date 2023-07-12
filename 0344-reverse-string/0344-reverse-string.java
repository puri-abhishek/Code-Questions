class Solution {
    public void reverseString(char[] s) {
        for(int i = 0; i < s.length / 2; i++)
        {
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
    }
}

/* <another approach but i dont think this matches the requirements>
class Solution {
    public void reverseString(char[] s) {
        StringBuffer sb = new StringBuffer();
        sb.append(s);
        sb.reverse();

        for (int i = 0; i < s.length; i++) {
            s[i] = sb.charAt(i);
        }
  }
}
*/