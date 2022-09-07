package java_sample_code;

import java.util.Scanner;

public class reverse_String {
	public static void main(String[] args) 
	{
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String word=sc.nextLine();
//      char arr[]=  word.toCharArray();
//     // String wrd=" ";
//      System.out.println(arr.length);
//      for(int i=arr.length-1;i>=0;i--)
//      {
//    	  System.out.print(arr[i]);
//      }
//      String wrd=String.valueOf(arr);
//      if(word==wrd)
//      {
//    	  System.out.println("Entered string is palindrome");
//      }
//      else 
//      {
//    	  System.out.println("Entered string is not a palindrome");
//      }
        StringBuilder sb=new StringBuilder();
        sb.append(word);
        sb.reverse();
        System.out.println("Reversed String is:"+sb);
        String wrd2=String.valueOf(sb);
        System.out.println(wrd2);
        if(word.contentEquals(sb))
        {
        	System.out.println("Given String is palindrome");
        }
        else
        {
        	System.out.println("not a palindrome");
        }
        
//        StringBuffer sb1=new StringBuffer(word);
//        sb1.reverse();
//        System.out.println(sb1);
	}
}
