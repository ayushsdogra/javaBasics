import java.util.*;

public class patternsUsingFunctions {
    public static void hollowRect(int totRows, int totCols) {

        for (int i = 1; i <= totRows; i++) {

            for (int j = 1; j <= totCols; j++) {

                if (i == 1 || i == totRows || j == 1 || j == totCols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void invertedRotatedHalfPyramid(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void invertedHalfPyramidNumber(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

    public static void floydTriangle(int n) {
        int counter = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void zero_one_triangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("0 ");
                } else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }

    public static void butterfly(int n) {
        for (int i = 1; i <= n; i++) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 1; j <= (2 * (n - i)); j++) {
                System.out.print(" ");
            }
            // stars again
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 2nd half(inverted code)
        for (int i = n; i >= 1; i--) {
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // spaces
            for (int j = 1; j <= (2 * (n - i)); j++) {
                System.out.print(" ");
            }
            // stars again
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void hollowRhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // stars = tilted hollow rectangle
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    public static void diamond(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= ((2 * (i)) - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            // spaces
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // stars
            for (int j = 1; j <= ((2 * i) - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        /*
         * Scanner sc = new Scanner(System.in);
         * System.out.println("Enter the totRows: ");
         * int totRows = sc.nextInt();
         * 
         * System.out.println("Enter the totCols: ");
         * int totCols = sc.nextInt();
         */

        // hollowRect(totRows, totCols);
        // invertedRotatedHalfPyramid(5);
        // invertedHalfPyramidNumber(5);
        // floydTriangle(5);
        // zero_one_triangle(5);
        // butterfly(5);
        // rhombus(5);
        // hollowRhombus(5);
        diamond(5);
    }
}