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
		Scanner scanner = new Scanner(System.in);
		int T = scanner.nextInt();
		
		for(int i=0; i<T; i++){
		    int N = scanner.nextInt();
		    int[] A = new int[N];
		    int[] B = new int[N];
		    
		    for(int j=0; j<N; j++){
		        A[j] = scanner.nextInt();
		    }
		    
		    for(int j=0; j<N; j++){
		        B[j] = scanner.nextInt();
		    }
		    
		    long ans = 0;
		    long A_sum = A[0];
		    long B_sum = B[0];
		    boolean pfMatch = false;
		    
		    if(A[0]==B[0]){
		        ans = ans + A[0];
		        pfMatch = true;
		    }
		    for(int j=1; j<N; j++){
	            if(pfMatch==false){
	                A_sum = A_sum + A[j];
		            B_sum = B_sum + B[j];
		            if(A_sum==B_sum){
                        pfMatch = true;
		            } 
		        }
		        else {
		            if(A[j]==B[j]){
		                ans = ans + A[j];
		            }
		            else{
		                pfMatch = false;
		            }
		            A_sum = A_sum + A[j];
		            B_sum = B_sum + B[j];
		        }
		    }
		    
		    System.out.println(ans);
		}
		
	}
}
