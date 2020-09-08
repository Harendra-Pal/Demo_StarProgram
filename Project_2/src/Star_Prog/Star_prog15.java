package Star_Prog;

import java.util.Scanner;

public class Star_prog15 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of rows needed to print pattern");
		
		int rows = in.nextInt();
		System.out.println("Printing the Pattern\n");
		
		for (int i=1; i<=rows; i++)
        {
            for (int j=1; j<=i; j++)
            {
                if( j == 1 || j == i || i == rows)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        in.close();
	}
}
