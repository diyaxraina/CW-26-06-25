import java.util.Scanner;

public class Calculator2{
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
    public int mul(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        if(b==0){
            System.out.println("cannot divide by zero");
        }
        return a/b;
    }
    public static void main(String[] args){

        Calculator2 cal=new Calculator2();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");

        int n1=sc.nextInt();
        System.out.println("enter second number");
        int n2=sc.nextInt();
        int result=n1+n2;
        System.out.println("result " +result);
        System.out.println("addition "+cal.add(n1,n2));
        System.out.println("subtraction "+cal.sub(n1,n2));
        System.out.println("multiplication "+cal.mul(n1,n2));
        System.out.println("division "+cal.div(n1,n2));

    }
}
