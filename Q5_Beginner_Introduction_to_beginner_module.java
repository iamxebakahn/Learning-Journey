// Problem Description

// Print the following pattern in output

//     *
//    **
//   ***
//  ****
// *****
// Output Format

// Print the following pattern in 5 lines with 4 spaces and 1 star, 3 spaces and 2 stars, 2 spaces and 3 stars, 1 spaces and 4 stars, 0 spaces and 5 stars in respectively lines

//     *
//    **
//   ***
//  ****
// *****
// Example Output

//     *
//    **
//   ***
//  ****
// *****
import java.lang.*;
import java.util.*;

public class Q5_Beginner_Introduction_to_beginner_module{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        for(int i=5;i>=1;i--)
        {
            for(int j=1;j<=i;j++)
               {
                    
                    if(j==i)
                    {
                        for(int k=5;k>=i;k--)
                          System.out.print("*");
                    }
                    else
                    System.out.print(" ");
               }

            System.out.println();
        }
        

    }
}
