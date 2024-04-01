package org.transformation90;

public class StarPattern {
    public static void main(String[] args){
        xPattern(5);
    }

    private static void xPattern(int n) {
        /*
        * * * * * * * * *
          * * * * * * *
            * * * * *
              * * *
                *
              * * *
            * * * * *
          * * * * * * *
        * * * * * * * * *

        * * * * * * * * *
          * * * * * * *
            * * * * *
              * * *
                *
        1. Increasing space
        2. Decreasing star with one less col
        3. Decreasing star
        4. Decreasing space with one less col
        5. Increasing star with +1 col
        6. Increasing star
         */

        for(int i = 0; i < n-1; i ++) {

            //1. Increasing space
            for (int j = 0; j < i; j++) {
                System.out.print("  ");//2 spaces
            }

            //2. Decreasing star
            for (int j = i; j < n - 1; j++) {
                System.out.print("* ");//1 star,1 space
            }

            //3. Decreasing star
            for (int j = i; j < n; j++) {
                System.out.print("* ");//1 star,1 space
            }
            System.out.println();
        }
        for(int i = 0; i < n; i ++){

            //4. Decreasing spaces
            for(int j = i; j < n-1; j++){
                System.out.print("  ");//2 space
            }

            //5. Increasing star
            for(int j = 0; j < i+1; j++){
                System.out.print("* ");//1 star,1 space
            }

            //6. Increasing star
            for(int j = 0; j < i; j++){
                System.out.print("* ");//1 star,1 space
            }
            System.out.println();
        }

    }
}
