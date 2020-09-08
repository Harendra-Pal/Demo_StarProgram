package Star_Prog;

import java.util.Scanner;

public class Star_prog03 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of rows needed to print pattern");
		
		int rows = in.nextInt();
		System.out.println("\n$$ Printing the pattern $$\n");
		
		for(int i = 1; i <= rows; i++)
		{
			for(int j = rows; j >= i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		in.close();
	}
}
