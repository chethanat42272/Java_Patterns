package java_sample_code;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) 
	{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no of rows:");
int num=sc.nextInt();

int row,col;
int sp=1;
sp=num-1;
for( row=0;row<num;row++)
{
	for(col=1;col<=sp;col++)
	{
		System.out.print(" ");
	}
	sp--;
	for( col=0;col<=2*row;col++)
	{
		System.out.print("*");
	}
	System.out.println();
}
for(row=1;row<num-1;row++)
{
	for(col=1;col<=2*num-1;col++)
	{
		System.out.print("*");
	}
	if(row<=num)
	{
	System.out.println();
	}
}
	}

}
