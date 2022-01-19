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
		int test = sc.nextInt();
			List<Integer> val= new ArrayList<Integer>();
		while(test-->0){
		   	val.add(sc.nextInt());
		}
		   	Collections.sort(val);
		   	for(Integer  a : val ){
		   	    System.out.println(a);
		   	}
		   
		
	}
}
