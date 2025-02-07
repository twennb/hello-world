public class math {
    public static void main(String[] args) {
        //Math.round() rounds to nearest integer
        int x = Math.round(6.4f);
        System.out.println(x); //Output: 6

        //Math.ceil() rounds up regardless of nearest integer
        double num = 2.3d;
        System.out.println(Math.ceil(num)); //Output: 3.0

        //Math.floor() rounds down
        int result = (int)Math.floor(1.7f);
        System.out.println(result); //Output: 1
        //Using ceil or floor on an already whole integer
        //returns the same integer

        //we can use Math.max(), or Math.min() to return the
        //highest or lowest number from a pool
        int max = Math.max(1, 4); //Math.min() would return 1
        System.out.println(max); //Output: 4

        //the Math.random() method returns a double between
        //0 and 1
        double random = Math.random();
        System.out.println(random); //Output: well, random..
        //we can alter tha random range by multiplying the
        //resulting number by a scale so if we want 0 - 100:
        double randomBig = Math.random() * 100;
        System.out.println(randomBig); //Output: random 0-100

        //if we don't want decimals we can round and cast to
        //an int
        int randomInt = (int) Math.round(Math.random() * 100);
        System.out.println(randomInt);
    }
}
