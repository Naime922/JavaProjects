package SaturdayProjects.week03;

public class Assignment10 {
    public static void main(String[] args) {
        String sentence = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {“I love programming and problem solving}";
//        String sender = sentence.substring(0,sentence.indexOf("."));
//        String number= sentence.substring(sentence.indexOf(".")+2,sentence.indexOf("+")-1);
//        String message = sentence.substring(sentence.indexOf("+")+2);

//        System.out.println(sender);
//        System.out.println(number);
//        System.out.println(message);


        String actualSender= sentence.substring(sentence.indexOf("<") + 1, sentence.indexOf(">"));
        String actualNumber= sentence.substring(sentence.indexOf("[") + 1, sentence.indexOf("]"));


        String actualMessage= sentence.substring(sentence.indexOf("{") + 1, sentence.indexOf("}")+1);

        System.out.println(sentence);
        System.out.println("Sender: "+actualSender);
        System.out.println("Number: "+actualNumber);
        System.out.println("Message: "+actualMessage);
    }
}
