import java.util.Scanner ;

 class codechef {
     
public static void main (String[] args) {
    /* code */


Scanner sc = new Scanner(System.in);


int test = sc.nextInt();
while(test>0){
    int A= sc.nextInt();
int B = sc.nextInt();
if(B>0){
    int result =A%B;
    System.out.println(result);

}
test--;
}
}
}