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
            Scanner sc= new Scanner(System.in);
            int T=sc.nextInt();
            for (int i=0;i<T;i++ ){
                int N=sc.nextInt();
                int size=0;
                int[] arr= new int[N];
                for (int j=0;j<N ; j++) {
                    int value=sc.nextInt();
                    int start=0;
                    int end=size-1;
                    int mid=0;
                    if(end<0){
                        arr[start]=value;
                        size++;
                    }else{
                        while(start<=end){
                            mid=(start+end)/2;
                            if(arr[mid]==value){
                                start=mid+1;
                            }else if(arr[mid]>value){
                                   end=mid-1;
                            }else{
                                start=mid+1;
                            }
                        }
                        if(arr[mid]==value){
                            arr[mid+1]=value;
                            if(mid+1>size-1){
                             size++;
                            }
                        }
                        else if(arr[mid]>value){
                            arr[mid]=value;
                        }else{
                               arr[mid+1]=value;
                            if(mid+1>size-1) {
                                size++;
                            }
                        }
                    }
                }
                System.out.print(size+" ");
                for (int l=0;l<size;l++ ) {
                    System.out.print(arr[l] +" ");
                }
                System.out.println();       
            }
        } catch(Exception e) {
            return;
        }
	}
}
