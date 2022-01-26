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
		      int n = sc.nextInt();
		      int a [] = new int [n];
		      int b [] = new int [n];
		       int m =0;
		       for(int i=0; i<n;i++){
		             a[i] = sc.nextInt();
		       }
		       for(int i =0 ; i<n ; i++){
		             b[i]= sc.nextInt();
		       }
		       for(int i=0;i<n; i++){
		             int res = (a[i] *20) - (b[i] * 10);
		             if(res <0){
		                   res=0;
		             }
		              m=Math.max(res,m);
				
			}
			System.out.println(m);
		       }
		       
		}
	}
