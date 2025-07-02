import java.util.Scanner;
public class text1
{
public static void main(String[] args)
 {
 System.out.println("Diya");
 Scanner sc= new Scanner(System.in);


 System.out.print("Enter your name: ");
 String name = sc.nextLine();

 System.out.print("Enter your roll number: ");
 int roll = sc.nextInt();

 System.out.println("Name: " + name);
 System.out.println("Roll Number: " + roll);
 }
}