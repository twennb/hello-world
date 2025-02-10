import java.util.Scanner;

public class input {
    public static void main (String[] args) {
        /*
        scanner class is used to read user input.
        requires the java.util package and can be
        copied into an object for us to use.
        we have to declare how we want to read input within
        the "new Scanner()" parentheses
        */
        Scanner scanner = new Scanner(System.in);
        /*
        different methods specify what data it wants to read.
        if we don't include a prompt text the output will be
        blank.
        */
        System.out.print("Age: ");
        byte age = scanner.nextByte(); //expects a byte value input
        scanner.nextLine(); //included to parse the end of line not read by nextByte()
        System.out.println("You are " + age + " years old.");
        /*
        for text input we have "next" for single words and
        "nextLine" for multiple word inputs:
         */
        System.out.print("First and last Name: ");
        String name = scanner.nextLine(); //can take multiple words
        System.out.println("Your name is " + name);
    }
}
