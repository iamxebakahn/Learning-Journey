// Problem Description

// Print the following Pattern in Output :
// ******
// *
// *
// *
// ******


// Problem Constraints

// No contstraints


// Input Format

// No need to take input.


// Output Format

// Print the following pattern in 5 lines with 6 stars in first and last line, and 1 star in 2nd, 3rd, and 4th line.
// ******
// *
// *
// *
// ******


// Example Input

// No input required.


// Example Output

// Output :
// ******
// *
// *
// *
// ******
import java.lang.*;
import java.util.*;

public class Q1AP_Beginner_Introduction_to_beginner_module{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        
        for(int i=5;i>=1;i--)
        {
            if((i==5)||(i==1))
            {
                for(int j=1;j<=6;j++)
                    System.out.print("*");
            }
            else 
                System.out.print("*");
            
            System.out.println();
            
        } 

      

    }
}
