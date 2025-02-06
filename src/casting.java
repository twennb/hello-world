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

        // it is not possible to cast between incompatible
        // data types such as String to int, but there is
        // a method using wrapper classes for the different
        // numeral data types:
        String number = "1";
        //int numb = (int)number + 2; cannot convert this way
        int numb = Integer.parseInt(number) + 2;
        System.out.println(numb);
        //this same method works for all primitive numeral data types
    }
}
