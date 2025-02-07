import java.text.NumberFormat;
import java.util.Currency;

public class number_formatting {
    public static void main (String[] args) {
        // formatting numbers to display as currency
        // 10000 to £10,000

        //NumberFormat currency = new NumberFormat(); //this is wrong
        // we cannot instantiate it like a normal class
        // because it is an abstract class

        // we instead have to use a "get" factory method to
        // create an instance of the class:
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        // if needed we can specify the currency:
        currency.setCurrency(Currency.getInstance("EUR"));
        // we then use that object to format and store the result in
        // a new variable:
        String result = currency.format(1234567.891);
        System.out.println(result);

        // We can also do the same for percent using
        // NumberFormat.getPercentInstance()
        NumberFormat percent = NumberFormat.getPercentInstance();
        String percentage = percent.format(0.345);
        System.out.println(percentage);

        // we can shorten the code with method chaining since we don't
        // need the standalone "percent" variable anywhere else:
        String methodChain = NumberFormat.getPercentInstance().format(0.246);
        System.out.println(methodChain);
    }
}
