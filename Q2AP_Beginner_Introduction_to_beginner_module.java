import java.lang.*;
import java.util.*;

public class Q2AP_Beginner_Introduction_to_beginner_module.java{
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        for(int i=1;i<=5;i++)
        {
            if((i==1)||(i==5))
            {
                 for(int j=1;j<=6;j++)
                    {
                         System.out.print("*");
                    }
            }

            else
            {
                for(int j=1;j<=6;j++)
                    {
                        if((j==1)||(j==6))
                            System.out.print("*");
                        else
                            System.out.print(" ");
                    }

            }

            System.out.println();
            
        }
    }
}