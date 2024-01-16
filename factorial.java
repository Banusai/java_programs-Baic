import java.util.Scanner;
public class factorial {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to find factorial: ");
        int n=sc.nextInt();
        int r=1;
        for(int i=1;i<=n;i++){
            r=r*i;
        }

        System.out.println("Factorial of the Given Number is: "+r);

        sc.close();
    }
}
