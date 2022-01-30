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
		// your code goes here
		int n=sc.nextInt();
		boolean[] tw=new boolean[n];
		int k=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<k;i++){
		    String s=sc.nextLine();
		    int a=s.length();
		    int sum=0;
		    if(s.charAt(5)=='A'){
		        for(int j=0;j<n;j++){
		            tw[j]=false;
		        }
		        sum=0;
		    }
		    else{
		         int t=Integer.parseInt(s.substring(6));
		         tw[t-1]=(!tw[t-1]);
		         for(int j=0;j<n;j++){
		             if(tw[j]){
		                 sum++;
		             }
		            }
		    }
		    System.out.println(sum);
		}
	}
}
