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
		      double x1  = sc.nextDouble();
		      double x2 = sc.nextDouble();
		      
		      double y1 = sc.nextDouble();
		      double y2 = sc.nextDouble();
		      if((y1/x1) < ( y2/x2))
		      System.out.println(-1);
		      else if ((y1/x1) > ( y2/x2))
		      System.out.println(1);
		      else if ((y1/x1) == ( y2/x2))
		      System.out.println(0);
	}
}
}