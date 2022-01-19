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
		   
		    int dc = sc.nextInt();
		    int co= sc.nextInt();
		     int a[]=new int[3];
	            int b[]=new int[3];
		    int suma = 0;
		    int sumb = 0;
		    for(int i =0 ; i<3;i++){
		        a[i]= sc.nextInt();
		        suma = suma + a[i];
		    }
		     for(int j =0 ; j<3;j++){
		        a[j]= sc.nextInt();
		        sumb = sumb +a[j];
		    }
		    if(suma>=150 && sumb>=150&& 2*dc>co){
		        System.out.println("YES");
		    } else if (suma>=150 && sumb<150 && co+dc < 2*dc){
		         System.out.println("YES");
		    } else if (suma<150 && sumb>=150 && co+dc < 2*dc){
		         System.out.println("YES");
		    }else {
		        System.out.println("NO");
		    }
		}
	}
}
