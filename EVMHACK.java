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
		int t = sc.nextInt();
		while(t-->0){
		      int a = sc.nextInt();
		      int b = sc.nextInt();
		      int c = sc.nextInt();

		      int p= sc.nextInt();
		      int q = sc.nextInt();
		      int r = sc.nextInt();
		      int helf = (p+q+r) / 2;
		      if( (p+b+c) > helf || (a+q+c) > helf ||  (a+b+r) > helf ){
		            System.out.println("yes");
		      }else {
		            System.out.println("no");
		      }
	}
	}
}
