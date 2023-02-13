package SaturdayProjects.week07;

public class Assignment7 {
    public static void main(String[] args) {

            String str=" ";
           str.trim();
           // System.out.println(str);
            System.out.println(str.equals("")+" "+str.isEmpty());
            //System.out.println(str.isEmpty());

        String str1 =" ";
        str.trim(); // we can't change a String, we have to assign it to another String. We will have "false false" result.


        System.out.println(str1.equals("") + " " + str1.isEmpty());
    }
}
