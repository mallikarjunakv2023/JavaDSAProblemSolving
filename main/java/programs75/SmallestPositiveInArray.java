package programs75;

// you can also use imports, for example:

import java.util.HashSet;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class SmallestPositiveArray {

    public static void main(String[] args){
        int[] A = {1,2,6,4,5,7};
        System.out.println(solution(A));
    }
    public static int solution(int[] A) {
        // Implement your solution here

        int b = 1;
        HashSet<Integer> set = new HashSet<>();
        for(int a : A){
            if (a > 0){
                set.add(a);
            }
        }
        int N = set.size();
        for(int i =1; i <= N + 1 ; i++){
            if(!set.contains(i)){
                System.out.println(i);
                b = i;
                break;
            }
        }

        return b;
    }

}

