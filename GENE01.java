/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try {
		    Scanner sc = new Scanner(System.in);
		   char x =sc.next().charAt(0);
		   char y =sc.next().charAt(0);
		   int a , b;
		   if(x=='R'){
		       a=1;
		   }else if(x=='B'){
		       a=2;
		   }else {
		       a=3;
		   }
		   
		   	   if(y=='R'){
		       b=1;
		   }else if(y=='B'){
		       b=2;
		   }else {
		       b=3;
		   }
		   if(a>b){
		       System.out.println(y);
		   }else{
		        System.out.println(x);
		   }
		    
		}catch (Exception e ){
		    System.out.println(e);
		}
	}
}
