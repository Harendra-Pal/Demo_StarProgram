package Star_Prog;

import java.util.Scanner;

public class Star_prog01 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows needed to print the pattern ");
        
        int rows = in.nextInt();
        System.out.println("\n## Printing the pattern ## \n");		// Get the number of rows from the user
        
        for (int i=1; i<=rows; i++)					//for rows
        {
            for (int j=1; j<=i; j++)				// Print i number of stars
            {
                System.out.print("*");
            }
            System.out.println();
        }
        in.close();
	}
}

