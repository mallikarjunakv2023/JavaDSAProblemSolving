package Interview;

import java.util.ArrayList;
import java.util.List;

public class test {


    public static void main(String[] args){
        //System.out.println(1+2==+3+++5);
        System.out.println("DEF" +10*20);
        List<? extends Number> li = new ArrayList<Number>();
        //li.add(3.14);
        //li.add(null);
        List<? super Number> li1 = new ArrayList<Number>();
        li1.add(3.14);
        li1.add(null);

    }
}
