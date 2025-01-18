package perfectPractice2025.recursion;

public class Fibbonicci {
    public static void main(String[] args){
        System.out.println(fibbonicci(10));
    }

    private static int fibbonicci(int i) {
        if(i <= 1)
            return i;
        return fibbonicci(i - 1) + fibbonicci(i - 2);
    }
}
