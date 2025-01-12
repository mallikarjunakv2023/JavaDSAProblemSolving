package perfectPractice2025.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CountSubarrayXorK {
    public int subarrayXor(int[] nums, int k) {
        int xor = 0;
        int count = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int j=0;j<nums.length;j++){
            xor ^= nums[j];
            int x = xor ^ k;
            if(map.containsKey(x)){
                count += map.get(x);
            }
            map.put(xor,map.getOrDefault(xor,0)+1);
        }
        return count;
    }

    public int solve(ArrayList<Integer> a, int k) {
        int n = a.size(); //size of the given array.
        int xr = 0;
        Map<Integer, Integer> mpp = new HashMap<>(); //declaring the map.
        mpp.put(xr, 1); //setting the value of 0.
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            // prefix XOR till index i:
            xr = xr ^ a.get(i);

            //By formula: x = xr^k:
            int x = xr ^ k;

            // add the occurrence of xr^k
            // to the count:
            if (mpp.containsKey(x)) {
                cnt += mpp.get(x);
            }

            // Insert the prefix xor till index i
            // into the map:
            if (mpp.containsKey(xr)) {
                mpp.put(xr, mpp.get(xr) + 1);
            } else {
                mpp.put(xr, 1);
            }
        }
        return cnt;
    }
}
