package java_sample_code;

import java.util.Scanner;

public class primeNumbers 
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number:");
	int num=sc.nextInt();
	int count1=0;
	String primenumber=" ";
	for(int i=1;i<=num;i++)
	{
		
		int count=0;
		for(int j=i;j>=1;j--)
		{
			if(i%j==0)
			{
				count=count+1;
			}
		}
		if(count==2)
		{
			count1++;
			System.out.print(i+" ");
			primenumber=primenumber+i+" ";
			
		}
	}
	System.out.println();
	System.out.println("Number of PrimeNumbers in a given range: "+count1);
	System.out.println("PrimeNumbers with in a range:"+primenumber);
}
}
