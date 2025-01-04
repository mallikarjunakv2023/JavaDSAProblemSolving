package perfect.slidingWindow;

import java.util.HashMap;

public class FruitIntoBasket {
    /*
    Input: fruits = [1,2,3,2,2]
    Output: 4
    Explanation: We can pick from trees [2,3,2,2].
    If we had started at the first tree, we would only pick from trees [1,2]
     */
    public int totalFruit(int[] fruits) {
        //initialise l,r,maxLen and map
        //iterate till n with r
        //put the num in map
        //check if the size > 2, if so remove l, check value of removed num, if 0 remove the num itself, l++
        //if size if <=2 find the maxLen and move r

        int l = 0, r = 0, maxLen = 0;
        int n = fruits.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        while(r < n){
            map.put(fruits[r], map.getOrDefault(fruits[r],0) + 1);
            if(map.size() > 2){
                map.put(fruits[l], map.get(fruits[l]) - 1);
                if(map.get(fruits[l]) == 0){
                    map.remove(fruits[l]);
                }
                l++;
            }
            if(map.size() <= 2){
                maxLen = Math.max(maxLen, r - l + 1);
            }
            r++;
        }
        return maxLen;

    }
}
