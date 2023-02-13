package SaturdayProjects.week03;

public class Assignment6 {
    public static void main(String[] args) {
        String word1 = "apple";
        System.out.println(word1.substring(1));
        word1 = word1.replace(word1.substring(0,1),"");

        System.out.println(word1);

        String word2 = "banana";
       // word2 = word2.replace(word2.substring(word2.length()-1),"");
        //replaces all a
        word2 =word2.substring(0,word2.length()-1);


        System.out.println(word2);

    }
}
