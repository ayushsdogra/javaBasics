import java.util.*;

public class leapYear {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();

        // Approach 1 using if-else ladder
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("It is a Leap Year");
                } else {
                    System.out.println("It's not a Leap Year");
                }
            } else {
                System.out.println("It's a Leap Year");
            }
        } else {
            System.out.println("It's not a Leap Year");
        }

        // Approach 2 using Ternary operator

        String isLeapYear = (year % 4) == 0
                ? (year % 100) == 0 ? (year % 400) == 0 ? "Yes a Leap Year" : "Not a Leap Year" : "Yes a Leap Year"
                : "Not a Leap Year";
        System.out.println(isLeapYear);

        // Using Logical Operator and if

        if ((year % 4 == 0) && ((year % 100 != 0) || ((year % 100 == 0) && (year % 400 == 0)))) {
            System.out.println("Leap Year");
        } else {
            System.out.println("Not a Leap Year");
        }

    }

}