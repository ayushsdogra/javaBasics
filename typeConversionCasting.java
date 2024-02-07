import java.util.*;

// type conversion and type casting concepts

public class typeConversionCasting {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        // int a = 12;
        // long b = a; // possible
        // System.out.println(b);

        // long = 256;
        // int b = a;
        // System.out.println(b);

        // int number = sc.nextFloat(); // error
        // float number = sc.nextInt(); // possible
        // System.out.println(number);

        // float a = 25.0f;
        // int b = a; // error
        // int b = (int) a; // Possible this is type casting

        // float marks = 99.999f;
        // int result = (int) marks;

        char ch = 'a';
        int number = ch; // possible converting ch to int
        System.out.println(number);

    }
}
