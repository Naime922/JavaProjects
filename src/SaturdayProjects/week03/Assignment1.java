package SaturdayProjects.week03;

public class Assignment1 {
    public static void main(String[] args) {
//        String word1 = "Java";
//        String word2 = "mouse";
//        String word3 = "computer";
        //Instruction : Given three String variables of some text,
        // find and print the longest word that also contains 'a'.
        // You should check each variable manually.
        String s1 = "java";
        String s2 = "mouse";
        String s3 = "computer";

        int lengthS1 = s1.length();     //4
        int lengthS2 = s2.length();     //5
        int lengthS3 = s3.length();     //8

        boolean s1Has = s1.contains("a");   //true
        boolean s2Has = s2.contains("a");   //false
        boolean s3Has = s3.contains("a");   //false

        System.out.println("\""+ s1 +"\"" + " is the longest word and also it contains \"a\"");

        System.out.println("The length of " + "\"" + s1 + "\"" + " is "+lengthS1 );

        System.out.println("Does " + "\"" + s1 + "\"" + " contains \"a\" = " +s1Has);













    }
}
