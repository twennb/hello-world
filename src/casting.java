public class casting {
    public static void main(String[] args) {
        //Implicit casting
        short x = 1;
        int y = x + 2;
        System.out.println(y);

        //can easily cast to a higher container of data
        // byte > short > int > long

        short i = 1;
        float k = i + 2;
        System.out.println(k);
        //floats and doubles contain more precision and are
        // therefore higher on the chain
        // byte > short > int > long > float > double

        double num = 2.1d;
        //int num2 = num + 1; gives an error
        int num2 = (int)num + 1;
        System.out.println(num2);
        // explicitly casting down a double to an int
        // loses the decimal data. Whenever data loss
        // is possible we have to explicitly cast
    }
}
