package java_sample_code;

import java.util.Scanner;

public class pattern4 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of rows:");
	int num=sc.nextInt();
	int row,col;
	int sp=1;
	sp=num-1;
	for(row=1;row<=num;row++)
	{
		for(col=1;col<=sp;col++)
		{
			System.out.print(" ");
		}
		sp--;
		for(col=0;col<=2*(row-1);col++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	sp=1;
	for(row=1;row<=num-1;row++)
	{
		for(col=1;col<=sp;col++)
		{
			System.out.print(" ");
		}
		sp++;
		for(col=0;col<=2*(num-row-1);col++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
}
}
