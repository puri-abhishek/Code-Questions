/*<time limit exceeds>
class Solution {
    public int totalFruit(int[] fruits) {
        int max = 0;
        
        for(int i = 0; i < fruits.length; i++){
            Set<Integer> basket = new HashSet<>();
            int j = i;
            for( j = i; j < fruits.length; j++){
                if(basket.size() == 2 && !basket.contains(fruits[j]))
                    break;
                basket.add(fruits[j]);
            } 
            max = Math.max(max, j - i);
        }
        return max;
    }
}
*/
class Solution {
    public int totalFruit(int[] fruits) {
        int i = 0, j = 0;
        int max = 0;
        Map<Integer, Integer> b = new HashMap<>();
        while(j < fruits.length){
            b.put(fruits[j], 1 + b.getOrDefault(fruits[j], 0));
            if(b.size() > 2){
                b.put(fruits[i], b.get(fruits[i]) - 1); 
                if(b.get(fruits[i]) == 0){    
                    b.remove(fruits[i]);
                }
                i++;   
            }
            max = Math.max(max, j - i + 1); 
            j++;    
        }

        return max;  
    }
}