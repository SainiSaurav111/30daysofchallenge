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
	int test = sc.nextInt();
	while(test-->0){
	    int num = sc.nextInt();
	    int sum = 0;
	    while(num!=0){
	        sum = sum + num%10;
	        num = num/ 10;
	    }
	    System.out.println(sum);
	}
	}
}
