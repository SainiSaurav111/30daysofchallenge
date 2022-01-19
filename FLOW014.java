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
        while(test-->0){
            double hd = sc.nextDouble();
            double cc= sc.nextDouble();
            double ts = sc.nextDouble();

            boolean h = hd>50;
            boolean c = cc<0.7;
            boolean t = ts >5600;

            if(h && c && t){
                System.out.println(10);

            }
             else if(h && c){
                System.out.println(9);

            }
             else if(c && t) {
                System.out.println(8);

            }
             else if(h &&  t){
                System.out.println(7);

            }
             else if(h || c|| t){
                System.out.println(6);

            }else{
                System.out.println(5);
            }
        }
	}
}
