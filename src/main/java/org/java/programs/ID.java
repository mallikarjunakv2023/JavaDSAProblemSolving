package org.java.programs;

public class ID {
    public static void main(String []args){
        String result = Normalizer.normalize("/-");
        System.out.println(result);
    }


    public static class Normalizer {
        public static String normalize(String string) {
            String ref = "http://localhost:80/";
            if(!ref.contains(string))
                return ref;
            StringBuilder newResult = new StringBuilder();
            int refIndex = 0, resultIndex = 0, stringIndex = 0, len = ref.length();
            while( stringIndex < string.length() ) { //h
                if(ref.charAt(refIndex) != string.charAt(stringIndex)){
                    System.out.println("Inside if");
                    char c = ref.charAt(refIndex);
                    newResult.append(c); //h
                    System.out.println("result - "+newResult.toString());
                    refIndex++; //1
                    len--; //1
                }
                else{
                    System.out.println("Inside else");
                    newResult.append(string.charAt(stringIndex));
                    System.out.println("result - "+newResult.toString());
                    resultIndex++;
                    stringIndex++;
                    refIndex++;
                    len--;
                }
            }

            while (refIndex < ref.length()){
                char c = ref.charAt(refIndex);
                newResult.append(c); //h
                System.out.println("result - "+newResult.toString());
                refIndex++;
            }
            System.out.println("returning - "+newResult.toString());
            return newResult.toString();
        }

    }
}



