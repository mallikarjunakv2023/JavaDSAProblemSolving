package perfectPractice2025.math;

public class GCD {
    public static void main(String[] args){
        System.out.println(findGCD(4, 44));
    }
    //Euclidean algorithm
    public static int findGCD(int n, int m){
        int gcd = 0;
        int lcm = 0;
        while(m > 0 && n > 0){
            if( m > n)
                m = m % n;
            else
                n = n % m;
        }
        if (m ==0)
            gcd = n;
        else
            gcd = m;
        lcm = (m*n)/gcd;
        System.out.println("LCM: "+lcm);
        return gcd;
    }
}
