/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	      try {
	            
	      
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		      double sum =0;
		      double max =0;
		      int n = sc.nextInt();
		      int a [] = new int [n];
		      for(int i =0; i<n ; i++){
		            a[i] = sc.nextInt();
		             sum = sum + a[i];
		      max = Math.max(max,a[i]);
		      }
		     
		      double p = (double)(sum-max)/ (n-1);
		      double ans = (double)(p+max);
		      System.out.println(ans);
		      
		      
		}
		
	}catch (Exception e ){
	      System.out.println(e);
	}
	}
}
