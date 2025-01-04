package programs;

class ReverseString{
    public static void main(String[] args) {

        String str = "Mallik.  ";
        String revString = reverseString(str);

        System.out.println("Reversed string : "+revString);
    }

    private static String reverseString(String str){
        StringBuilder reversedString = new StringBuilder();

        if(str.length() <= 1)
            return str;

        for(int i = str.length() -1 ; i >= 0; i--){
            reversedString.append(str.charAt(i));
        }

        return reversedString.toString();
    }
}
