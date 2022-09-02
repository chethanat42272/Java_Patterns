package java_sample_code;

import java.util.Scanner;

public class find_sum_of_oddpositionDigit_evenpositionDigit 
{
public static void main(String[] args) 
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number:");
int num=sc.nextInt();//44744
String num1=String.valueOf(num);
int nos=num1.length();
System.out.println("Length of number: "+nos);
int Oddsum=0,Evensum=0;
while(num>0) 
{
	if(nos==2||nos==4||nos==6||nos==8) {
	int d=num%10;
	Evensum=Evensum+d;
	num=num/10;
	if(num!=0)
	{
		int d1=num%10;
		Oddsum=Oddsum+d1;
		num=num/10;
	}
	}
	else if(nos==1||nos==3||nos==5||nos==7)
	{
		int d=num%10;
		Oddsum=Oddsum+d;
		num=num/10;
		if(num!=0)
		{
			int d1=num%10;
			Evensum=Evensum+d1;
			num=num/10;
		}
	}
}
System.out.println("Sum of oddposition digit is: "+Oddsum);
System.out.println("Sum of evenposition digit is: "+Evensum);


}
}
