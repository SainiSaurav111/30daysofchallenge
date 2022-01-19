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
			Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int q=0;q<t;q++){
		    int n=sc.nextInt();
		    int c=n/100;
		    n=n%100;
		    c+=n/50;
		    n=n%50;
		    c+=n/10;
		    n=n%10;
		    c+=n/5;
		    n=n%5;
		    c+=n/2;
		    n=n%2;
		    c+=n;
		    System.out.println(c);
		}
	}
}
