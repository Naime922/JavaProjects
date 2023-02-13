package Mortgage;

//
//            StateTax class was created. Add a private int tax variable to this class.
//        Create a constructor which gets String stateName as parameters.
//        Assign 20 to tax variable if stateName is New York,
//        Assign 15 to tax variable if stateName is New Jersey,
//        Assign 5 to tax variable if stateName is Florida,
//        Assign 12 to tax variable if stateName is Ohio
//
//        by creating private setTax method and call this method in the constructor.
//        Make sure tax variable cannot be changed after it is assigned.
//        create a private vairable int tax;
//        create the constructor
//        create a get method of the tax
public class StatesTax {

    private final int tax;

    public StatesTax(String stateName) {
        this.tax=setTax(stateName);


    }
    private int setTax(String stateName){

        int tax=0;
        if(stateName.equalsIgnoreCase("New York")){
            tax=20;
        } else if (stateName.equalsIgnoreCase("New Jersey")){
            tax=15;
        } else if (stateName.equalsIgnoreCase("Florida")) {
            tax=5;
        } else if (stateName.equalsIgnoreCase("Ohio")) {
            tax=12;
        }return tax;

    }

    public int getTax() {
        return tax;
    }




}
