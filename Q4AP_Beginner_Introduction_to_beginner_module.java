// Problem Description

// Print the following Pattern in Output :
// ******
// *
// *
// ******
//      *
//      *
// ******


// Problem Constraints

// No constraints.


// Input Format

// No need to take input.


// Output Format

// Print the following pattern in 7 lines with 6 stars in first, fourth and last line, and 1 star in 2nd and 3rd line, 5 spaces and 1 star in 5th and 6th line.
// ******
// *
// *
// ******
//      *
//      *
// ******


// Example Input

// Input not required.


// Example Output

// Output :
// ******
// *
// *
// ******
//      *
//      *
// ******
import java.lang.*;
import java.util.*;

public class Q4AP_Beginner_Introduction_to_beginner_module.java{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        for(int i=1;i<=7;i++)
        {
            if((i==1)||(i==4)||(i==7))
            {
                for(int j=1;j<=6;j++)
                    System.out.print("*");
            }

            else if((i==2)||(i==3))
            {
                System.out.print("*");
            }

            else
            {
                for(int k=1;k<=6;k++)
                {
                    if(k==6)
                        System.out.print("*");
                    else
                    System.out.print(" ");
                }
            }
            System.out.println();

        }




    }
}
