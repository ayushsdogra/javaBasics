import java.util.*;

public class loopsAssignment {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // Write a program that reads a set of integers, and then prints the sum of the
        // even and odd integers
        /*
         * int num;
         * int evenSum = 0;
         * int oddSum = 0;
         * int choice; // to continue with the loop
         * 
         * do {
         * System.out.println("Enter the no ");
         * num = sc.nextInt();
         * if (num % 2 == 0) {
         * evenSum += num;
         * 
         * } else {
         * oddSum += num;
         * }
         * System.out.
         * println("Do you want to continue one more loop ? Press 0 for no and 1 for yes."
         * );
         * choice = sc.nextInt();
         * } while (choice == 1);
         * 
         * System.out.println("Sum of Even Numbers: " + evenSum);
         * System.out.println("Sum of Odd Numbers: " + oddSum);
         */

        // Write a program to find the factorial of any number entered by the user.

        /*
         * int num;
         * int fact = 1;
         * 
         * System.out.print("Enter the number: ");
         * num = sc.nextInt();
         * for (int i = 1; i <= num; i++) {
         * fact *= i;
         * }
         * System.out.println("Factorial is: " + fact);
         */

        // Write a program to print the multiplication table of a number N, entered by
        // the user.

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        System.out.println("Multiplication table is: ");

        for (int i = 1; i <= 10; i++) {

            System.out.println(n + "*" + i + "=" + (n * i));
        }

    }
}