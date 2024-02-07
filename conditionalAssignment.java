import java.util.*;

public class conditionalAssignment {
    public static void main(String args[]) {

        // Question1:Write a Java program to get a number from the user and print
        // whether it is positive or negative

        /*
         * Scanner sc = new Scanner(System.in);
         * float number = sc.nextFloat();
         * if (number > 0) {
         * System.out.println("The Input Number is Positive");
         * } else {
         * System.out.println("The Input Number is Negative");
         * }
         */

        // Question2:Finish the following code so that it prints You have a fever if
        // your temperature is above 100
        // and otherwise prints You don't have a fever.

        /*
         * double temp = 103.5;
         * if (temp > 100) {
         * System.out.println("You have a Fever");
         * } else {
         * System.out.println("You are Ok; You don't have a Fever");
         * }
         * 
         * Question3: Write a Java program to input week number(1-7) and print day of
         * week name using switch case.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter week number (1-7)");
        int week = sc.nextInt();

        switch (week) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;

            default:
                System.out.println("Kindly enter valid input");
        }
    }
}