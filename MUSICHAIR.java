
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner s=new Scanner(System.in);
        try {
            int t=s.nextInt();
            while(t-->0){
                int n=s.nextInt();
                int c=0;
                n--;
                for(int i=1;i<=Math.sqrt(n);i++){
                    if(n%i==0){
                        if(n/i==i) c++;
                        else c+=2;
                    }
                }
                System.out.println(c);
                
            }
        } catch (Exception e) {
            
        }
        s.close();
	
	}
}
