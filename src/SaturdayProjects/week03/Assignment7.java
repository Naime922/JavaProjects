package SaturdayProjects.week03;

public class Assignment7 {
    public static void main(String[] args) {
        String word = "Elephant";
        //System.out.println(word.length());
        if (word.length() % 2 == 0){
            System.out.println(word.substring(word.length() / 2 - 1, word.length() / 2 + 1));

        } else {
            System.out.println("no");
        }
        //System.out.println(word.substring(word.length() / 2 - 1, word.length() / 2 + 1));


        //teacher did
        String word1 = "positive";
        //is it even or odd
        boolean isItEven = word1.length()%2==0;   //true , so it is even

        //it is even, so return two middle characters , posITive
        String middleCharacters = word1.substring(word1.length()/2-1,word1.length()/2+1 );
        System.out.println("Middle character of the string: " +middleCharacters);

    }
}
