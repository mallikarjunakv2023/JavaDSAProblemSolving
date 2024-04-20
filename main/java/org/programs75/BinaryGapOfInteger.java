package org.programs75;

import java.util.ArrayList;
import java.util.List;

public class BinaryGapOfInteger {
    public int solution(int N) {
        String intStr = Integer.toBinaryString(N);
        int gap = 0;

        List<Integer> onesList = new ArrayList<>();

        for(int i = 0; i < intStr.length(); i++){
            if(intStr.charAt(i) == '0'){
                continue;
            }
            onesList.add(i);
        }

        for(int i = 0; i < onesList.size() - 1; i++){
            int diff = onesList.get(i+1) - onesList.get(i) - 1;
            gap = Math.max(gap, diff);
        }
        return gap;

    }
}
