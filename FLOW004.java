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
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		
	for(int i =0; i<test ; i++){
		    int num = sc.nextInt();
		    int last = num %10 ;
		    int rem =0;
		    while(num > 0 ){
		       rem = num % 10 ;
		        num = num / 10;
		    
		    }
		     System.out.println(last + rem);  
		    
		}
	}
}
