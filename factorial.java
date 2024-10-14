import java.util.Scanner;

public class FactorialRecursive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        long result = factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
    }

    public static long factorial(int n) {
        if (n == 0) {
            return 1;  // Base case: 0! = 1
        } else {
            return n * factorial(n - 1);  // Recursive case
        }
    }
}
