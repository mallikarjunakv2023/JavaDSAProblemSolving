package org.practice.perfect.math;

public class Pow2 {
    public double myPow(double x, int m) {
        long n = m;
        double ans=1;
        if(n<0)
            n = n * -1;
        while(n >0){
            if(n % 2 == 1){
                ans = ans * x;
                n = n - 1;
            }
            else{
                n = n / 2;
                x = x * x;
            }
        }
        if(m < 0){
            ans = (1.0 / ans);
        }
        return ans;
    }
}
