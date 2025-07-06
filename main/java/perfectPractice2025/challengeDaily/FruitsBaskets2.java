package perfectPractice2025.challengeDaily;

import java.util.Arrays;

public class FruitsBaskets2 {

    public static void main(String[] args){
        int[] fruits = {8, 6};
        int[] baskets = {2, 4};
        System.out.println(numOfUnplacedFruits(fruits,baskets));
    }

    public static int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int unplaced = 0;
        int i = 0;
        int j = 0;
        int[] placed = new int[baskets.length];
        Arrays.fill(placed, 0);

        while (i < fruits.length && j < baskets.length) {
            if (fruits[i] <= baskets[j] && placed[j] == 0) {
                i++;
                placed[j] = 1;
                j = 0;
            } else {
                j++;
                if (j >= baskets.length) {
                    i++;
                    unplaced++;
                    j = 0;
                }
            }
        }
        return unplaced;
    }
}
