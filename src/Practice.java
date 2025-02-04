import java.util.Arrays;

public class Practice {

    public static void main(String[] args){
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        int[] numbersQuick = {1,2,3,6,8,9,4};
        System.out.println(numbersQuick.length);
    }
}
