package SaturdayProjects.week07;

public class Assignment9 {
    public static void main(String[] args) {


    //What will be the output of the following code?

    String [] [] arr = {{"A", "B", "C"}, {"D","E"}};

        for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j <arr[i].length ; j++) {
            System.out.print(arr[i][j]);
            if(arr[i][j].equals("B")){
                break;
            }

        }

    }
}

// i = 0 j = 0  A
//    i = 0 j = 1 B    break the inner loop; go to outer loop
//    i= 1 j = 0 D
//    i= 1 j = 1 E
//

//    result A B D E
}
