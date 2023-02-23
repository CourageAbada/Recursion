public class Recursion {
    public static void main(String[] args) {
        // Setting the n value to the value of 10
        int n = 10;
        System.out.println("1, 2, "+fibSeq(n,1,2));
    }
    
    // A recursive function that displays the fibonacci sequence using if and else statement
    public static String fibSeq(int n, int firstNumb, int secondNumb) {
        // Using base case where it returns the values from the fibonacci sequence
        // Base case returns itself from 0 and 1
        if (n <= 0)
            return "";
        else
            return Integer.toString(firstNumb + secondNumb) + ", " + fibSeq(n - 1,secondNumb, firstNumb + secondNumb);

    }
}

// 1, 2, 3, 5, 8, 12