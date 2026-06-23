
// Problem: Print the pattern (Butterfly Pattern). *             *
//                                                 * *         * *
//                                                 * * *     * * *
//                                                 * * * * * * * *
//                                                 * * * * * * * *
//                                                 * * *     * * *
//                                                 * *         * *
//                                                 *             *
// Solution:        Upper Half              Lower Half             First Part             Second Part
//               *             *         * * * * * * * *             *                           *
//               * *         * *         * * *     * * *             * *                       * *
//               * * *     * * *         * *         * *             * * *                   * * *
//               * * * * * * * *         *             *             * * * *               * * * *

public class Problem_1 {
  public static void main(String[]args) {
    // For rows
    int n = 4;

    //Outer loop: For Upper Half
    for(int i=1; i<=n; i++){

        // Inner loop: For First Part
        for(int j=1; j<=i; j++){
            System.out.print(" * ");
        }

        // For spaces
        int space = 2 * (n - i);
        for(int j=1; j<=space; j++){
            System.out.print("   ");
        }
        
        // Inner loop: Second Part
        for(int j=1; j<=i; j++){
            System.out.print(" * ");
        }

        // Move to the next line after printing each row
        System.out.println(  );        
    }

    //Inner loop: For Lower Half
    for(int i=n; i>=1; i--){

        // Inner loop: For Inverted First Part
        for(int j=1; j<=i; j++){
            System.out.print(" * ");
        }

        // For spaces
        int spaces = 2 * (n - i);
        for(int j=1; j<=spaces; j++){
            System.out.print("   ");
        }
        
        // Inner loop: Inverted Second Part
        for(int j=1; j<=i; j++){
            System.out.print(" * ");
        }

        // Move to the next line after printing each row
        System.out.println(  );        
    }
    }
}