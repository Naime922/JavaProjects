package SaturdayProjects.week03;

public class Assignment8 {
    public static void main(String[] args) {

        String sentence1 = "Java is a fun language";
        String word2 = sentence1.substring(0,sentence1.indexOf(" "));
       String newSentence = sentence1.substring(sentence1.indexOf(" ")+1);
        System.out.println(newSentence);
        System.out.println(newSentence + " " + word2);


    }
}
