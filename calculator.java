import java.util.*;

public class calculator {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a : ");
        int a = sc.nextInt();

        System.out.print("Enter the value of b : ");
        int b = sc.nextInt();

        System.out.print("Enter the value of c : ");
        int c = sc.nextInt();

        System.out.print("Enter the value of d : ");
        int d = sc.nextInt();

        System.out.print("Enter the operator : ");
        char operator = sc.next().charAt(0);

        switch (operator) {

            case '+':
                System.out.println(a + b + c + d);
                break;
            case '-':
                System.out.println((a - b) - c - d);
                break;
            case '*':
                System.out.println(a * b * c * d);
                break;
            case '/':
                System.out.println(a / b / c / d);
                break;
            case '%':
                System.out.println(a % b % c % d);
                break;

            default:
                System.out.println("Enter valid operator");

        }
    }
}