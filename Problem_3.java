// Problem: Print the pattern (Number Pyramid).     1
//                                                 2 2
//                                                3 3 3
//                                               4 4 4 4
//                                              5 5 5 5 5

public class Problem_3 {
  public static void main(String[]args) {
    // Number of rows in the rhombus
    int n = 5;

    // Outer loop: Manages the number of rows
    for(int i=1; i<=n; i++){

       // For spaces: Prints spaces to create the pyramid alignment
        int space = n - i;
        for(int j=1; j<=space; j++){
            System.out.print(" ");
        }

        // Inner loop: Prints the row number 'i' for 'i' times
        for(int j=1; j<=i; j++){
            System.out.print( i + " ");
        }

        // Move to the next line after printing each row
        System.out.println(  );        
    }
    }
}