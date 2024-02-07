import java.util.*;

public class loops2 {
    public static void main(String args[]) {

        // code for reverse the no the print it

        int n = 10899;
        while (n > 0) {
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n / 10;
        }
        System.out.println("No Reversed Successfully");

        // reverse the given number

        int a = 108976757;
        int rev = 0;
        while (a > 0) {
            int lastDigit = a % 10;
            rev = (rev * 10) + lastDigit;
            a = a / 10;
        }
        System.out.println(rev);
    }
}