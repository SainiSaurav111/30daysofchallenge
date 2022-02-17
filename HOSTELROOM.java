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
		      int x = sc.nextInt();
		      int ans =x;
		      int sum =x;
		      int arr [] = new int[n];
		      for(int i =0; i<n ; i++){
		            arr[i] = sc.nextInt();
		            sum +=   arr[i];
		            ans = Math.max(ans, sum);
		      }
		     
		      System.out.println(ans);
		}
	}
}
