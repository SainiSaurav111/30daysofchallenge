/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    	 static int sum ( int n){
		    return (n*(n+1)/2);
		}
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
	
			int test = sc.nextInt();
				while(test!=0){
			int d = sc.nextInt();
			int N = sc.nextInt();
			int Z = N;
			    for(int i =0; i<d ; i++){
			        Z= sum(Z);
			     
			    }
			      System.out.println(Z);
			     test--;
			}
			sc.close();
		
	
	}
}
