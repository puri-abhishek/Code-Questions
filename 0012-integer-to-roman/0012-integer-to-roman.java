/*class Solution {
    public String intToRoman(int num) {
        String thou[] = {"","M","MM","MMM"};
        String hun[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String ten[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String one[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        
        return thou[num / 1000] + hun[(num % 1000) / 100] + ten[(num % 100) / 10] + one[num % 10];
    }
}*/

class Solution {
    public String intToRoman(int num) {
     
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanNumerals = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        StringBuilder sb = new StringBuilder();

        int i = 0;
    
        while (num > 0) 
        {
            if (num >= values[i]) 
            {
                
                sb.append(romanNumerals[i]);
                num -= values[i];
            } 
            else 
                i++;
        }

        return sb.toString();
    }
}