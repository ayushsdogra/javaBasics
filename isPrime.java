import java.util.*;

public class isPrime {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no: ");
        int n = sc.nextInt();

        if (n == 2) {
            System.out.println("n is prime");
        } else {

            boolean isPrime = true;
            for (int i = 2; i <= Math.sqrt(n); i++) {
                if (n % 2 == 0) {
                    isPrime = false;
                }
            }
            if (isPrime = true) {
                System.out.println("no is prime");
            } else {
                System.out.println("no is not a prime");
            }
        }
    }
}