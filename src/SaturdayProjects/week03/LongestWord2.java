package SaturdayProjects.week03;

public class LongestWord2 {
    public static void main(String[] args) {
        String word1 = "Java";
        String word2= "mouse";
        String word3 = "apples";


        int len1 = word1.length();
        int len2 = word2.length();
        int len3=word3.length();

        boolean cont1 = word1.contains("a");
        boolean cont2 = word2.contains("a");
        boolean cont3 = word3.contains("a");

        System.out.println("\"" + word3 + "\"" + " is the longest word." );
        System.out.println("The length of " + "\""+ word3 + "\"" + " is "+ len3);
        System.out.println("Does "+ "\""+word3+"\" "+ "contains " + "a = " + cont3);
    }
}
