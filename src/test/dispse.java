package test;
//WAP that displays all the numbers from range void display(int start , int end)
import java.util.Scanner;

public class dispse {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the start and end numbers:");
        int a= sc.nextInt();
        int b=sc.nextInt();
        dispse1 obj=new dispse1();
        obj.disp(a,b);
    }
}
