public class relationalLogicalOper {
    public static void main(String args[]) {

        /*
         * int a = 20;
         * int b = 20;
         * System.out.println("Is value of a and b are equal? ");
         * System.out.println((a == b));
         */

        System.out.println((3 > 2) && (5 > 0)); // Logical And
        System.out.println((3 > 2) && (5 < 0));

        System.out.println((3 > 2) || (5 > 0)); // Logical Or
        System.out.println((3 < 2) || (5 < 0));

        System.out.println(!(0 > 5)); // Logical Not

    }
}