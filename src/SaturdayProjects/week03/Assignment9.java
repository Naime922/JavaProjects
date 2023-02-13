package SaturdayProjects.week03;

public class Assignment9 {
    public static void main(String[] args) {
        String nameAndLast1 = "James bond";
        String nameAndLast2="Alex benji";

        String last1=nameAndLast1.substring(nameAndLast1.indexOf(" ")+1);
        String last2 = nameAndLast2.substring(nameAndLast2.indexOf(" ")+1);

        if(last1.equals(last2)){
            System.out.println("Related");

        }else{
            System.out.println("Not related");
        }
        //System.out.println(last1 + " " + last2);



    }
}
