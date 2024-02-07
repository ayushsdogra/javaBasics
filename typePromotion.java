import java.util.*;

public class typePromotion {
    public static void main(String args[]) {

        // char a = 'a';
        // char b = 'b';
        /*
         * System.out.println((int) (b));
         * System.out.println((int) (a));
         * System.out.println(a);
         * System.out.println(b - a);
         */

        // char c = a - b;
        // System.out.println(c); // not possible bcz a-b is a expression so we have to
        // type promotion in expression

        /*
         * short a = 5;
         * byte b = 25;
         * char c = 'c';
         * byte bt = (byte) (a + b + c);
         * System.out.println(bt);
         */

        int a = 10;
        float b = 20.25f;
        long c = 25;
        double d = 30;
        // int ans = a + b + c + d; // error ncz converting double into int
        // double ans = a + b + c + d; // no error bcz double is bigger than int hence
        // no lossy conversion
        int ans = (int) (a + b + c + d);
        System.out.println(ans);

        byte e = 5;
        e = (byte) (e * 2);
        System.out.println(e);
    }

}