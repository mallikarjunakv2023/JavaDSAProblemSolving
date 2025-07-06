package programs75;

public class FizzBuzz {
    public static String[] printFizzBuzz(int n) {

        String[] arr = new String[n];

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                arr[i - 1] = "FizzBuzz";
            } else if (i % 3 == 0) {
                arr[i - 1] = "Fizz";
            } else if (i % 5 == 0) {
                arr[i - 1] = "Buzz";
            } else {
                arr[i - 1] = Integer.toString(i);
            }
        }
        return arr;

    }
}
