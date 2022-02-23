/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;
import static java.lang.Math.min;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		while(t-->0){
		      int a = sc.nextInt();
		      int b = sc.nextInt();
		      int c = sc.nextInt();
		    //  if( a > b && c> b   ){
		    //        System.out.println( a+ c );
		    //  } else if ( a > c && b > c   ){
		    //        System.out.println( a+ b);
		    //  }else if (b>a && c>a) {
		    //        System.out.println(b +c);
		    //  }else if (b==c){
		    //        System.out.println( a+b);
		    //  }else{
		    //        System.out.println(2 *a);
		    //  }
	 int  temp=a<b?a:b;
	 int smallest=c<temp?c:temp; 
		  
		    System.out.println( a+b+c - smallest );
		}
	}
}
