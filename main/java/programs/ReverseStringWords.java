package programs;

class ReverseStringWords {
    public static void main(String[] args) {

        String str = "Mallik Arjun K V";
        String revString = reverseStringWords(str);

        System.out.println("Reversed string : "+revString +", and length : "+revString.length());
    }

    private static String reverseStringWords(String str){
        StringBuilder reversedString = new StringBuilder();
        String[] stringArray = str.split(" ");

        if(stringArray.length <= 1)
            return str;

        for(int i = stringArray.length - 1 ; i >= 0; i--){
            reversedString.append(stringArray[i]);
            reversedString.append(" ");
        }

        return reversedString.toString().trim();
    }
}
