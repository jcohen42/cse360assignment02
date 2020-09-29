package cse360assignment02;


public class AddingMachine {
    private int total;
    private String currentString;

    //Main method sets calls AddingMachine functions
    public static void main(String[] args) {
        //Create a new AddingMachine object 'num'
        AddingMachine num = new AddingMachine();
        //Perform manipulations on 'num'
        num.add(4);
        num.subtract(2);
        num.add(5);
        //Print out the history of operations by calling toString()
        System.out.print(num.toString());
    }

    //Class constructor
    public AddingMachine () {
        total = 0;  // not needed - included for clarity
        currentString = "";
    }

    //Returns the variable total
    public int getTotal () {
        return total;
    }

    //Adds the parameter 'value' to the total
    public void add (int value) {
        currentString += (" + " + value);
        total = total + value;
    }

    //Subtracts the parameter 'value' to the total
    public void subtract (int value) {
        currentString += (" - " + value);
        total = total - value;
    }

    //Returns the history of operations on 'total' as a string
    public String toString () {
        String zero = "0";
        return zero.concat(currentString);
    }

    //Resets 'total' to 0
    public void clear() {
        total = 0;
    }
}