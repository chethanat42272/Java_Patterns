package java_sample_code;

import java.util.Scanner;

public class pattern1 
{
	public static void main(String[] args) 
	{
		                                          
		Scanner sc=new Scanner(System.in);   
		System.out.println("Enter the no of rows:");
		int n=sc.nextInt();
		for(int row=0;row<n;row++)
		{
			
		
			for(int col=row;col<n;col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		

	}



}
