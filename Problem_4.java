// Problem: Print the pattern (Palindromic Pyramid).     1
//                                                     2 1 2
//                                                   3 2 1 2 3
//                                                 4 3 2 1 2 3 4
//                                               5 4 3 2 1 2 3 4 5
 
public class Problem_4 {
  public static void main(String[]args) {
    // Number of rows in the Palindromic Pyramid
    int n = 5;

    // Outer loop: Manages the number of rows
    for(int i=1; i<=n; i++){

       // 1. For spaces: Creates pyramid alignment
        int space = n - i;
        for(int j=1; j<=space; j++){
            System.out.print("  ");
        }

        // First half (Descending): Prints numbers from i down to 1
        for(int j=i; j>=1; j--){
            System.out.print( j + " ");
        }

        // Second half (Ascending): Prints numbers from 2 up to i
        for(int j=2; j<=i; j++){
            System.out.print( j + " ");
        }

        // Move to the next line after printing each row
        System.out.println(  );        
    }
    }
}