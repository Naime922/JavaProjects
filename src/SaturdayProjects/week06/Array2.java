package SaturdayProjects.week06;

public class Array2 {
    public static void main(String[] args) {
        int[] array = {2, 3, 15, 15, 3, 2};


        boolean same = true;
        for (int i = 0; i < array.length / 2; i++) {
            if (array[i] != array[array.length - i - 1]) {
                same = false;


            }

        }
        if (same) {
            System.out.println("The elements are the same when read from the front or the back.");
        } else {
            System.out.println("The elements are not the same when read from the front or the back.");
        }
    }
}


