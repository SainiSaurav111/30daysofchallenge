/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    try{
	        
	    
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test-->0){
		   int salary = sc.nextInt();
		  //  int hra = sc.nextInt();
		  //  int da = sc.nextInt();
		    if(salary>= 1500){
		       System.out.println(salary + 500 + (salary * 0.98));
		    }else{
		        System.out.println(salary + (salary * 0.10) + (salary * 0.90));
		    }
		}
	}catch(Exception e){
	    System.out.println(e);
	}
}
}