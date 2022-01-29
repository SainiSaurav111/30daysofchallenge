import java.util.Arrays;
import java.util.Scanner;

class lapindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t =0; t < test; t++){
            String str = sc.next();
            int mid = str.length()/2;
            String str1;
            String str2;
            if(str.length() % 2 == 0){
                str1 = str.substring(0, mid);
                str2 = str.substring(mid,str.length());
               // System.out.print(str1 + " " + str2);
            }
            else{
                str1 = str.substring(0,mid);
                str2 = str.substring(mid+1,str.length());
                //System.out.print(str1 + " " + str2);
            }
            char[] temp1 = str1.toCharArray();
            char[] temp2 = str2.toCharArray();
            Arrays.sort(temp1);
            Arrays.sort(temp2);
            str1 = String.copyValueOf(temp1);
            str2 = String.copyValueOf(temp2);
            //System.out.print(str1 + " " + str2);
            if(str1.equals(str2)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }

        }

        sc.close();
    }
    
}
