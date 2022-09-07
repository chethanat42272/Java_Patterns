package java_sample_code;

import java.util.Scanner;

public class pattern3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int num=sc.nextInt();
		for(int row=0;row<(2*num);row++)
		{
			int totalcol=row>num?(2*num-row):row;
			for(int col=0;col<totalcol;col++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
