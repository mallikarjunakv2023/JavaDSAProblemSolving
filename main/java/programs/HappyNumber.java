package programs;

import java.util.HashSet;

public class HappyNumber {
    public static void main(String[] args){
        System.out.println("Is happy number : " + isHappyNumber(102));
    }

    private static boolean isHappyNumber(int n) {
        HashSet<Integer> set = new HashSet<>();

        while(n != 1 && !set.contains(n)){
            int sum = 0;
            set.add(n);
            while (n != 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum;
        }

        return n == 1;
    }
}
