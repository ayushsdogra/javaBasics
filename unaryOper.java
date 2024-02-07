public class unaryOper {
    public static void main(String args[]) {

        int a = 10;
        /*
         * int b = ++a; // pre-increment
         * System.out.println("Pre Increment value of a " + (a));
         * System.out.println("Pre Increment value of b " + (b));
         */

        /*
         * int b = a++; // post-increment
         * System.out.println(a);
         * System.out.println(b);
         */

        /*
         * int b = --a; // predecrement;
         * System.out.println(a);
         * System.out.println(b);
         */

        int b = a--; // postdecrement
        System.out.println(a);
        System.out.println(b);

    }

}
