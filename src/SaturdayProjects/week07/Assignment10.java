package SaturdayProjects.week07;

public class Assignment10 {
    public static void main(String[] args) {
//        What will be the output of the following code?

        int wd = 0;
        String [] days = {"sun","mon","wed","sat"};
        for (int i = 0; i < days.length; i++) {
            switch (days[i]) {
                case "sat":
                case "sun":
                    wd -=1;
                    break;
                case "mon":
                    wd ++;
                case "wed":
                    wd+=2;
            }

        }
        System.out.println(wd);
    }
    ////wd=0 i=0  sun wd=0-1=-1 break
    //        //wd=-1 i=1 mon wd=-1+1=0  wed wd=0+2=2
    //        //wd=2 i=2  wed wd=2+2=4
    //        //wd=4 i=3  sun wd=4-1=3 break
}

