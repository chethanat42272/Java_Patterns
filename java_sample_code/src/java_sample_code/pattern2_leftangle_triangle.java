package java_sample_code;

import java.util.Scanner;

public class pattern2_leftangle_triangle 
{
	public static void main(String[] args)
	
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of rows:");
        int n=sc.nextInt();
        int a,b;
        for(a=0;a<n;a++)
        {
        	for(b=2*(n-a);b>=0;b--)
        	{
        		System.out.print(" ");
        	}
        	for(b=0;b<=a;b++)
        	{
        		System.out.print("* ");
        	}
        	System.out.println();
        }
	}
}
