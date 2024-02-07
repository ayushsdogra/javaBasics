// Functions and Methods

import java.util.*;

public class functions1 {
    public static void printHelloWorld() { // void is empty return type and printHelloWorld is function name
        System.out.println("Hello World");
        int i = 1;
        while (i <= 5) {
            System.out.println("HelloWorld");
            i++;
        }
        // return;
    }

    /*
     * public static void main(String args[]) {
     * printHelloWorld(); // function calling
     * }
     */

    // code using functions of calculation

    public static void calcSum() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a + b;
        System.out.println("Sum is " + c);
    }

    /*
     * public static void main(String args[]) {
     * calcSum();
     * }
     */

    // addition using parameters
    public static int calculateSum(int num1, int num2) /* num1 and num2 are formal parameters */ {
        int sum = num1 + num2;
        return sum;

    }

    /*
     * public static void main(String args[]) {
     * Scanner sc = new Scanner(System.in);
     * int a = sc.nextInt();
     * int b = sc.nextInt();
     * int c = calculateSum(a, b);// a and b are actual parameters
     * System.out.println("Sum is :" + c);
     * }
     */

    // Call by Value
    // Java always calls by value

    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println(" a is :" + a); // if we are printing the output hare then we are having output according to
                                           // the created function
        System.out.println("b is : " + b);
    }

    /*
     * public static void main(String args[]) {
     * int a = 5;
     * int b = 10;
     * swap(a, b);
     * System.out.println("a is :" + a); // and if we are printing the output here
     * we are having the output according to the main function not according to the
     * created function
     * System.out.println(" b is :" + b);
     * }
     */

    // code for product of a and b

    public static int multiply(int a, int b) {
        int product = a * b;
        System.out.println("product: " + product);
        return product;

    }

    /*
     * public static void main(String args[]) {
     * 
     * int a = 10;
     * int b = 10;
     * int prod = multiply(a, b);
     * System.out.println("Product is : " + prod);
     * 
     * prod = multiply(20, 5);
     * System.out.println("a*b is :" + prod);
     * 
     * }
     */

    // find factorial

    public static int factorial(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) {
            f = f * i;

        }
        return f;

    }

    /*
     * public static void main(String args[]) {
     * System.out.println(factorial(5));
     * }
     */

    // code to find binomial coefficient

    public static int binCoeff(int n, int r) {
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n - r);

        int binCoeff = fact_n / (fact_r * fact_nmr);
        return binCoeff;
    }

    /*
     * public static void main(String args[]) {
     * System.out.println(binCoeff(5, 2));
     * }
     */

    // code of sum using function overloading

    public static int sum(int a, int b) {
        int c = a + b; // to calculate sum of 2 no's
        return c;
    }

    public static int sum(int a, int b, int c) {
        int d = a + b + c;
        return d;
    }

    /*
     * public static void main(String args[]) {
     * System.out.println(sum(4, 5, 6));
     * }
     */

    // code of function overloading using datatypes
    // code of sum of numbers

    public static float sum(float a, float b) {
        return a + b;
    }

    /*
     * public static void main(String args[]) {
     * System.out.println(sum(3, 2, 1));
     * System.out.println(sum(3.1f, 2.9f));
     * }
     */

    // check if no is prime or not

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /*
     * public static void main(String args[]) {
     * System.out.println(isPrime(22));
     * }
     */

    // print all primes in a Range

    public static void primesInRange(int n) {
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " "); // only if true
            }
        }
        System.out.println();
    }

    /*
     * public static void main(String args[]) {
     * primesInRange(100);
     * }
     */

    // code Binary - Decimal

    public static void binToDec(int binNum) {
        int myNum = binNum;
        int pow = 0;
        int decNum = 0;

        while (binNum > 0) {
            int lastDigit = binNum % 10;
            decNum = decNum + (lastDigit * (int) Math.pow(2, pow));
            pow++;
            binNum = binNum / 10;
        }

        System.out.println("decimal of" + myNum + "=" + decNum);
    }

    /*
     * public static void main(String args[]) {
     * binToDec(111);
     * }
     */

    // code decimal to Binary

    public static void decToBin(int decNum) {
        int myNum = decNum;
        int pow = 0;
        int binNum = 0;

        while (decNum > 0) {
            int rem = decNum % 2;
            binNum = binNum + (rem * (int) Math.pow(10, pow));
            pow++;
            decNum = decNum / 2;
        }
        System.out.println("Binary Form of " + myNum + "=" + binNum);
    }

    /*
     * public static void main(String args[]) {
     * decToBin(15);
     * }
     */

    // code to compute average of 3 numbers

    public static void avg() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First No");
        int num1 = sc.nextInt();

        System.out.print("Enter Second No");
        int num2 = sc.nextInt();

        System.out.print("Enter Third No");
        int num3 = sc.nextInt();

        int d = (num1 + num2 + num3) / 3;
        System.out.println(d);

    }

    // second approach

    public static int avg(int a, int b, int c) {
        int d = (a + b + c) / 3;
        return d;
    }

    /*
     * public static void main(String args[]) {
     * System.out.println(avg(2, 3, 4));
     * 
     * }
     */

    // Write a method named isEven that accepts an int argument. The method should
    // return true if the argument is even , or false otherwise. Also write a
    // program to test your method.

    public static boolean isEven(int n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    /*
     * public static void main(String args[]) {
     * System.out.println(isEven(12));
     * }
     */

    // Write a Java program to check if a number is a palindrome in Java?

    public static boolean isPalindrome(int num) {
        int temp = num;
        int rev = 0;
        while (temp != 0) {
            int digit = temp % 10;
            rev = (rev * 10) + digit;
            temp = temp / 10;
        }
        if (num == rev) {
            return true;
        }
        return false;

    }

    /*
     * public static void main(String args[]) {
     * Scanner sc = new Scanner(System.in);
     * System.out.print("Enter the no: ");
     * int num = sc.nextInt();
     * if (isPalindrome(num)) {
     * System.out.println("The number " + num + " is palindrome ");
     * } else {
     * System.out.println("The number " + num + " is not palindrome");
     * }
     * 
     * }
     */

    // Write a Java method to compute the sum of the digits in an integer

    public static float sumOfDigits(float num) {
        float sum = 0;
        float temp = num;

        while (temp != 0) {
            int digit = (int) temp % 10;
            sum = sum + digit;
            temp = temp / 10;
        }

        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        float num = sc.nextFloat();

        System.out.println(sumOfDigits(num));
    }
}
