package perfect.math;

public class CountPrimesTillN {


    public static int countPrimes(int n){
        int[] primes = new int[n+1];
        int count = 0;
        for(int i = 2; i < n+1; i++){
            primes[i] = 1;
        }

        for(int i = 2; i * i <= n; i++){
            if(primes[i] == 1){
                for(int j = i * i; j <= n; j+=i){
                    primes[j] = 0;
                }
            }
        }
        for(int i = 2; i < n; i++){
            if(primes[i] == 1){
                count++;
            }
        }
        return count;
    }
    /*
    Idea:
There are several ways to go about solving this problem, but the classic solution is known as the sieve of Eratosthenes. For the sieve of Eratosthenes, we start by creating a boolean array (seen) of size n to represent each of the numbers less than n.

We start at 2 and for each number processed (num), we iterate through and mark each multiple (mult) of num, starting at num^2, as seen. We start at num^2 because every multiple up to the num'th multiple will have been guaranteed to have been seen before, since they're also a multiple of a smaller number. For example, when processing 5s, we can skip to 25 because 10 will have been seen when we processed 2s, 15 when we processed 3s, and 20 when we processed 2s.

Then we move num forward, skipping any numbers that have already been seen. By doing this, we will only stop on prime numbers, because they haven't been seen as a multiple of a previous iteration. We just have to update our count (ans) each time we stop and then return ans once we reach n.
     */

    public static int countPrimes1(int n) {
        //see array to keep track of primes < n
        boolean[] seen = new boolean[n];
        int count = 0;

        //iterate from 2 to n
        for (int num = 2; num < n; num++) {
            if (seen[num])
                continue;
            count += 1;
            for (long mult = (long)num * num; mult < n; mult += num)
                seen[(int)mult] = true;
        }
        return count;
    }
}
