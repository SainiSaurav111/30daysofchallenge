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
    
    int withdrawl =sc.nextInt();
    float balance = sc.nextFloat();
    
    
    if( withdrawl %5== 0 && withdrawl+0.50 <=balance){
     
     System.out.println(balance-withdrawl-0.50);
    return;
    }
    else{
    System.out.println(balance);
    }
	}
}
