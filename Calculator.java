import java.util.Scanner;

class calc{
    public int add(int n1,int n2){
        return n1+n2;
    }

    public int subtract(int n1,int n2){

        if(n1>n2){
            return n1-n2;
        }
        else{
            return n2-n1;
        }
    }

    public int Multiply(int n1,int n2){
        return n1*n2;
    }

    public int quotient(int n1,int n2){
        return n1/n2;
    }

    public int remainder(int n1,int n2){
        return n1%n2;
    }
}

public class Calculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("1.Addition");
        System.out.println("2.Subtraction");
        System.out.println("3.Multiply");
        System.out.println("4.Divison");
        System.out.println("5.Remainder");

        System.out.print("Enter Your choice: ");
        int n=sc.nextInt();

        System.out.print("Enter Your First Number: ");
        int n3=sc.nextInt();
        System.out.print("Enter Your Second Number: ");
        int n4=sc.nextInt();

        calc obj=new calc();

        int a=obj.add(n3,n4);
        int b=obj.subtract(n3,n4);
        int c=obj.Multiply(n3,n4);
        int d=obj.quotient(n3,n4);
        int e=obj.remainder(n3,n4);

        switch(n){

            case 1 -> System.out.println("Addition of the entered numbers: "+ a);
            case 2 -> System.out.println("Subtraction of the entered numbers: "+ b);
            case 3 -> System.out.println("Multiplication of the entered numbers: "+ c);
            case 4 -> System.out.println("Division of the entered numbers: "+ d);
            case 5 -> System.out.println("Remainder after division of the entered numbers: "+ e);

        }

        sc.close();

    }    
}

