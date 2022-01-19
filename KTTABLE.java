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
		try {
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		while(test!=0){
		    test--;
		    int n = sc.nextInt();
		    int arr1 [] = new int[n];
		    int arr2 [] = new int[n];
		    for(int i =0; i<n ; i++){
		        arr1[i]= sc.nextInt();
		    }
		    for(int i =0; i<n ; i++){
		        arr2[i]= sc.nextInt();
		    }
		    int temp=0;
		    int count = 0;
		    for(int i =0 ; i<n ; i++){
		        if(arr1[i] - temp >=arr2[i]){
		            count++;
		        }
		         temp = arr1[i];
		        }
		        System.out.println(count);
		       
		    }
		    
		
		}catch (Exception e ){
		    	return ;
		}

	}
}

