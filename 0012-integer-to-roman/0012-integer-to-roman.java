class Solution {
    public String intToRoman(int num) {
        String thou[] = {"","M","MM","MMM"};
        String hun[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String ten[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String one[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        
        return thou[num / 1000] + hun[(num % 1000) / 100] + ten[(num % 100) / 10] + one[num % 10];
    }
}