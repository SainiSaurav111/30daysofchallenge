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
		int R  = sc.nextInt();
		int O= sc.nextInt();
		int C = sc.nextInt();
		int rem = (20-O) ;
		int sum = rem *6 ;
		int sum1 = sum *6;
		
		
		C = sum1 + C;
		if(C>R){
		    System.out.println("yes");
		}else{
		    System.out.println("no");
		}
	}
}
