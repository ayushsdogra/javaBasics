import java.util.*;

public class loops1 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // 1. Print numbers from 1 to n
        // using while loop

        System.out.println("Enter the value of n: ");
        int n = sc.nextInt();
        /*
         * int Counter = 1;
         * 
         * while (Counter <= n) {
         * System.out.println(Counter + " ");
         * Counter++;
         * }
         * System.out.println("Succesfully Run");
         */

        // using for loop

        /*
         * for (int i = 1; i <= n; i++) {
         * System.out.println(i + " ");
         * }
         * System.out.println("Succesfully run");
         * 
         * // using do while loop
         * 
         * int i = 1;
         * do {
         * System.out.println(i + " ");
         * i++;
         * } while (i <= n);
         */

        // 2. Sum of n numbers
        // using while loop

        /*
         * int i = 1;
         * int sum = 0;
         * while (i <= n) {
         * sum += i;
         * i++;
         * }
         * System.out.println("Sum is : " + sum);
         */

        // using for loop

        /*
         * int sum = 0;
         * for (int i = 1; i <= n; i++) {
         * sum += i;
         * }
         * System.out.println("Sum is :" + sum);
         */

        // using do while loop
        int i = 1;
        int sum = 0;
        do {
            sum += i;
            i++;
        } while (i <= n);
        System.out.println("Sum is :" + sum);

    }
}