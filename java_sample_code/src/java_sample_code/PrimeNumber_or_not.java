package java_sample_code;
import java.util.Scanner;

public class PrimeNumber_or_not
{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int num=sc.nextInt();
	int count=1;
	for(int i=1;i<=num/2;i++)
	{
		if(num%i==0)
		{
			count=count+1;
		}
	}
	if(count==2)
	{
		System.out.println("Primenumber");
	}
	else 
	{
		System.out.println("Not a PrimeNumber");
	}
}
}
