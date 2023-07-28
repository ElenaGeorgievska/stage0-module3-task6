package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        int newNumber = (int) numberToBeRounded;
        System.out.println(newNumber);
    }

    public static void main(String[]args){
        FloatTypeCasting tc = new FloatTypeCasting();
        tc.roundNumber(3.5f);
    }

    //You will be given a float number, and your task will be to find a correct way to round this variable to integer variable, corresponding to Math rules (requires googling).
    //Print that variable to console.
    //Implement program inside a code snippet given above:
    // where float numberToBeRounded - is the variable which needs to be rounded.
}
