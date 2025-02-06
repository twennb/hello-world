import java.util.Arrays;

public class Practice {

    public static void main(String[] args){
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        System.out.println(numbers);
        System.out.println(Arrays.toString(numbers));

        //can also assign values right away by using {}
        int[] numbersQuick = {1,2,3,6,8,9,4};
        //several methods can be accessed through the
        //"." operator for lots of flexibility:
        System.out.println(numbersQuick.length);
        //Arrays.sort(); can rearrange an unsorted array


        //arrays can be multi-dimensional to represent
        //matrices or cubes:
        int[][] matrix = new int[2][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        //to print out a multi-dimensional array we use
        //Arrays.deepToString()
        System.out.println(Arrays.deepToString(matrix));
    }
}
