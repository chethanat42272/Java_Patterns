package java_sample_code;

import java.util.Scanner;

public class pattern6 {

	public static void main(String[] args) 
	{
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the no of rows:");
     int num=sc.nextInt();
     int row,col;
     int sp=1;
     sp=num-1;
     for(row=0;row<num;row++)
     {
    	 for(col=1;col<=sp;col++)
    	 {
    		 System.out.print(" ");
    	 }
    	 sp--;
    	 for(col=0;col<=2*row;col++)
    	 {
    		 System.out.print("*");
    	 }
    	 System.out.println();
     }
     for(row=1;row<=3;row++)
     {
    	 for(col=1;col<=4;col++)
    	 {
    		 System.out.print("*");
    	 }
    	 for(int space=1;space<=4;space++)
    	 {
    		 System.out.print(" ");
    	 }
    	 for(col=1;col<=5;col++)
    	 {
    		 System.out.print("*");
    	 }
    	 System.out.println();
     }
     for(row=1;row<=2;row++)
     {
    	 for(col=1;col<=2*num-1;col++)
    	 {
    		 System.out.print("*");
    	 }
    	 System.out.println();
     }
	}

}
