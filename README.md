# Recursion 
Fibonacci Sequence with Recursion
This is a Java program that displays the Fibonacci sequence using recursion. The Fibonacci sequence is a sequence of numbers where each number is the sum of the two preceding numbers. For example, the first few numbers in the sequence are 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, and so on.

This program takes an integer n as input and displays the first n numbers in the sequence. It uses a recursive function called fibSeq to calculate and print the numbers.

How to use the program
To use this program, you need to have Java installed on your computer. You can download and install Java from the official website.

Download the Recursion.java file and save it to your computer.
Open a terminal or command prompt and navigate to the directory where you saved the file.
Compile the program by running the command javac Recursion.java.
Run the program by running the command java Recursion.
The program will display the first 10 numbers in the Fibonacci sequence, as shown below:

Copy code
1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
How the program works
The main method sets the value of n to 10 and then calls the fibSeq function to generate the first n numbers in the sequence. The fibSeq function is a recursive function that uses if and else statements to generate the sequence.

The base case for the recursive function is when n is less than or equal to 0. In this case, the function returns an empty string. Otherwise, it calculates the next number in the sequence by adding the firstNumb and secondNumb variables and returns a string that contains the next number and a comma, followed by a recursive call to fibSeq with n-1 and the secondNumb and firstNumb+secondNumb variables as parameters.

The program uses the Integer.toString method to convert the integers to strings so that they can be printed to the console.
