package org.java.programs;

public class FindSqrt {

    public int mySqrt(int x) {
        if(x==0 || x==1)
            return x;

        for(int i=1;i<=x/2;i++){
            if((long)i*i==x)
                return (int)i;
            else if((long)i*i>x)
                return (int)i-1;
        }
        return x/2;
    }

    public int mySqrt1(int x) {
        if(x==0 || x==1)
            return x;
        //Binary search
        int start = 1, end = x, mid = -1;
        while(start <= end){
            mid = start + (end - start)/2;

            if( (long) mid * mid > (long) x)
                end = mid - 1;
            else if(mid * mid == x)
                return mid;
            else
                start = mid + 1;
        }
        return Math.round(end);
    }
}
