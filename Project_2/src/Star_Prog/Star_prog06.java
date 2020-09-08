package Star_Prog;

import java.util.Scanner;

public class Star_prog06 
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of rows needed to print the pattern");
		
		int rows = in.nextInt();
		System.out.println("Printing the pattern\n");
		
		for(int i = 1; i <= rows; i++)
		{
			for(int j = 1; j < i; j++)
			{
				System.out.print(" ");
			}
			for(int k = rows; k >= i; k--)
			{
				System.out.print("*");
			}
			for(int l = rows; l > i; l--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		in.close();
	}
}
