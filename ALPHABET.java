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
        String s = sc.next();
        int N = sc.nextInt();
        char[] c = s.toCharArray();

        while(N-->0){
            String s1 = sc.next();
            char[] c1 = s1.toCharArray();
            int count = 0;

            for(int i=0; i<s1.length(); i++){
                for(int j=0; j<c.length; j++){
                    if(c1[i]==c[j])
                       count++;
                }
            }
            if(count==s1.length())
                System.out.println("Yes");
            else
                System.out.println("No");
        }
	}
}
