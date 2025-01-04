package programs;

import java.util.ArrayList;
import java.util.List;

public class PascleTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();


        if(numRows <=0)
            return triangle;

        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);

        triangle.add(firstRow);

        for(int i = 1; i < numRows; i++){
            List<Integer> nextRow = new ArrayList<>();
            List<Integer> prevRow = triangle.get(i - 1);

            nextRow.add(1);

            for(int j = 1; j < i; j++){
                int sum = prevRow.get(j-1) + prevRow.get(j);
                nextRow.add(sum);
            }

            nextRow.add(1);
            triangle.add(nextRow);
        }

        return triangle;
    }
}
