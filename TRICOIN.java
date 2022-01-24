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
		// your code goes here
		  Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int height = solve(n);
            System.out.println(height);
        }
	}
	 public static int solve(int n){
        for (int i = 1; i <= n; i++) {
            if ((i*(i+1))/2 > n) {
                return i-1;
            }
            else if ((i*(i+1))/2 == n) {
                return i;
            }
        }
        return 0;
	}
}
