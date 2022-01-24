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
			Scanner sc =new Scanner(System.in);
		long T = sc.nextLong();
		while(T-->0)
		{
		    int n = sc.nextInt();
		    int[] a = new int[n+1];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    
		    for(int i=0;i<n-1;i++)
		    {
		      if(i % 2 == 0)
		      {
		          if(a[i]>a[i+1])
		          {
		              int temp=a[i];
		              a[i]=a[i+1];
		              a[i+1]=temp;
		          }
		      }
		      else
		      {
		          if(a[i]<a[i+1])
		          {
		              int temp=a[i];
		              a[i]=a[i+1];
		              a[i+1]=temp;
		          }
		      }
		    }
		    for(int i=0;i<n;i++)
		     System.out.print(a[i]+" ");
		     System.out.println();
	}
		sc.close();
	}
}
