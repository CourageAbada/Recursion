public class GCDRecursion {
    public static void main(String[] args) {
        System.out.println(findGCD(10, 5));

    }
    // Creating a recursive function to calculate the greatest common denominator
    // For two numbers, x and y
    // GCD returns a positive integer without a remainder
    public static int findGCD(int x, int y){
        if (x % y == 0){
            return y;
        }
        return findGCD(y, x%y);
    }
}
