import java.awt.*;
import java.sql.SQLOutput;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        String message = "Hello World" + "!!";
        System.out.println(message);

        // strings are immutable
        System.out.println(message.replace("!","*"));
        System.out.println(message.toLowerCase());
        System.out.println(message);
        // can use \ to print strings with " in them.
        // e.g. System.out.println("Hello \"World\""
        // results in the output: Hello "World"
        // since \ is used to exclude symbols it can
        // itself be excluded with another \
        // e.g. System.out.println("c:\\Windows\\..."

        // primitive types
        int age = 30;
        byte ageByte = 30, temperature = 20; //don't do this
        ageByte = 35;

        byte myAge = 30;
        byte herAge = myAge;
        System.out.println(herAge + ageByte);
        short littleNumber = 2025;
        int viewsCount = 123_456_789;
        long viewsCountLong = 3_123_456_789L;
        double price = 11.57;
        float priceFloat = 10.99f;
        char letter = 'A';
        boolean isEligible = false;

        // reference types
        String letters = "ABC";

        Date now = new Date();
        System.out.println(now);

        // --- primitives store values, reference types store references to values. independent|dependent
        byte x = 1;
        byte y = x;
        x = 2;
        System.out.println(y);

        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 4;
        System.out.println(point2);
    }
}