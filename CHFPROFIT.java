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
		int test= sc.nextInt();
		while(test-->0){
		      int x =sc.nextInt();
		      int y = sc.nextInt();
		      int z = sc.nextInt();
		      int sum = Math.abs(x * y) ;
		      int sum2 = Math.abs(x *z);
		      int ans = Math.abs(sum-sum2);
		       System.out.println(ans);
		}
		
	}
}
