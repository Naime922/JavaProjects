package SaturdayProjects.week07;

public class Assignment8 {
    public static void main(String[] args) {
        //2-1=1
        // i=1 j=0
        // first inner loop arr[i][j] arr[1][0]= 3
        // i=1 j=2
        // second inner loop arr[1][1]=4
        // after first inner output is 3 4
        //i=0 j=0
        // first inner loop arr[i][j] arr[0][0]= 1
        //i=0 j=1
        // first inner loop arr[i][j] arr[0][1]= 2
        //total output is 3 4 1 2
        int[][] arr = {{1, 2}, {3, 4}};
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }

    }
}