public class Arithmetic_Expressions {

    public static void main(String[] args) {
        //we can perform the common arithmetic expressions of
        //addition (+), subtraction (-), multiplication (*)
        //and division (/)

        //when using division it's important to consider
        //the data types, as dividing two integers will result
        //in an integer
        int result = 10 / 3;
        System.out.println(result);

        //we need to specify that the 10 and 3 are doubles
        //or else the program treats them as integers
        double quotient = (double)10 / (double)3;
        System.out.println(quotient);

        //there are also operators for quickly increasing or
        // decreasing the value of a variable
        int x = 1;
        ++x;
        System.out.println(x);

        // ++x increases the value of x by 1, while x++ can be
        // used to get the original value of x before modifying
        int y = 4;
        int z = y++;
        System.out.println(y);
        System.out.println(z);

        // can also be used to increment or decrement by more
        // than 1 at a time
        int xy = 1;
        xy -= 6;
        System.out.println(xy);

        // order of operations:
        // () before */ before +-
    }
}
