/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		while(T-->0){
		       long A,B,a,b,gcd=0,t;
		       A=sc.nextInt();
		       B=sc.nextInt();
		       a=A;
		       b=B;
		   
             while(b>0){
                 t=b;
                 b=a%b;
                 a=t;
             }
             gcd=a;
             long lcm=(A*B)/gcd;
             System.out.println(gcd+" "+lcm);
	}
	}
}


