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
		while(t>0) 
		{   int n=sc.nextInt(); 
		    int k=sc.nextInt(); 
		    int ans=k;
		    int a[]=new int[n]; 
		    for(int i=0;i<n;i++) 
		    { 
		        a[i]=sc.nextInt(); 
		    } 
		    Arrays.sort(a); 
		    int b[]=new int[n]; 
		    int m=n-1;
		    for(int i=0;i<n;i++,m--) 
		         b[i]=a[m]; 
		 /*  for(int i=0;i<n;i++)       
		       System.out.print(b[i]); 
		       System.out.println();  */
		  boolean check=false;   
		  for(int i=k;i<n;i++) 
		  { 
		      if(b[k-1]!=b[i]) 
		           check=true; 
		      else 
		         ans++; 
		         
		      if(check==true) 
		          break; 
		  } 
		   System.out.println(ans);
		    
		    
		    
		    
		    
		    
		    
		    t--;
		}
	}
}
