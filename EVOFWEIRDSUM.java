/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
		public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
		    //input starts here
		    long n= sc.nextInt();
		    long[] a = new long[(int)n];
		    long sum=0;
		    for(int i =0; i<n; i++)
		    {
		        a[i] = sc.nextInt();
		        sum+=a[i];
		    }
		    long ans = (sum/n);
		    System.out.println(ans);
		    t--;


	}
}
}