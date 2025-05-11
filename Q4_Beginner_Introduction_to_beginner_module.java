// Problem Description

// Print the following pattern in output

// *****  
// ****  
// ***  
// **  
// *
// Output Format

// Print the following pattern in 5 lines with 5, 4, 3, 2, 1 stars in each line

// *****  
// ****  
// ***  
// **  
// *
// Example Output

// *****  
// ****  
// ***  
// **  
// *
import java.lang.*;
import java.util.*;

public class Q4_Beginner_Introduction_to_beginner_module{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        for(int i=5;i>=1;i--)
           {
                for(int j=1;j<=i;j++)
                    System.out.print("*");
                
                System.out.println();
           }
    }
}
