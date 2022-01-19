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
		int test = sc.nextInt();
		while(test>0)
		{
		    int b = sc.nextInt();
		    if(b<=0)System.out.println(0);
		    else
		    {
		        b=b/2;
		        System.out.println((b*(b-1))/2);
		    }
		    test=test-1;
		}
		
	}
}
