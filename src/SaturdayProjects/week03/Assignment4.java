package SaturdayProjects.week03;

public class Assignment4 {
    public static void main(String[] args) {
        String message = "Hello world dumb";
        if (message.contains("idiot") || message.contains("dumb") || message.contains("heck")){
            System.out.println("Message not send because it has bad words!");

        }else {
            System.out.println("Message sent");
            System.out.println("Your message was " +message);
        }

    }

}
