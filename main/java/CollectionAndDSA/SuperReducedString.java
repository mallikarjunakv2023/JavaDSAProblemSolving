package CollectionAndDSA;

import java.io.IOException;

class SuperReducedString {

    /*
     * Complete the 'superReducedString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String superReducedString(String s) {
        // Write your code here
        StringBuffer sb = new StringBuffer(s);

        for(int i = 1; i < sb.length() ; i++){
            if(sb.charAt(i) == sb.charAt(i-1)){
                sb.delete(i-1, i+1);
                i = 0;
            }
        }

        if(sb.length() == 0){
            return "Empty String";
        }
        return sb.toString();
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        //BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = "aaabcddd";
        //abcd

        String result = SuperReducedString.superReducedString(s);
        System.out.println(result);
    }
}
