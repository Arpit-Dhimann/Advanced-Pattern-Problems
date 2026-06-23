// Problem: Print the pattern (Solid Rhombus Pattern).    * * * * *
//                                                      * * * * *
//                                                    * * * * *
//                                                  * * * * *
//                                                * * * * *

public class Problem_2 {
  public static void main(String[]args) {
    // Number of rows in the rhombus
    int n = 5;

    // Outer loop: To control the number of rows
    for(int i=1; i<=n; i++){

        // For spaces: Prints decreasing number of spaces as rows increase
        int space = (n - i);
        for(int j=1; j<=space; j++){
            System.out.print("   ");
        }

        // Inner loop: Prints stars for the solid rhombus shape
        for(int j=1; j<=n; j++){
            System.out.print(" * ");
        }

        // Move to the next line after printing each row
        System.out.println(  );        
    }
    }
}