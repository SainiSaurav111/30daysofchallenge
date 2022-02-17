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
		      int b [] = new int [n*2];
		      int sum =0;
		      for(int i =0; i< n*2 ;i++){
		           b[i] = sc.nextInt();
		          sum +=b[i];
		      }
		      if(sum % 2 ==0){
		            System.out.println("YES");
		      }else{
		              System.out.println("NO");
		      }
		}
	}
}
