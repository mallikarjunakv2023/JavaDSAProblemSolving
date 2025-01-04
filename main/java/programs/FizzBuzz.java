package programs;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        List<String> strArray = new ArrayList<>(n);
        for(int i = 1; i <=n; i++){
            if(i%3 == 0 && i%5 == 0)
                strArray.add("FizzBuzz");
            else if(i%5 == 0 )
                strArray.add("Buzz");
            else if(i%3 == 0)
                strArray.add("Fizz");
            else
                strArray.add(Integer.toString(i));
        }
        return strArray;
    }
}
