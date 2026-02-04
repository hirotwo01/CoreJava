import java.util.Scanner;

public class FromToNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int a= sc.nextInt();
        System.out.println("enter second number");
        int b= sc.nextInt();
        if(a<0||b<0)
        {
            System.out.println("make both numbers greater than 0");
            return ;
        }
        if(a>b){
            int temp= a;
            a = b;
            b = temp;
        }
        System.out.println("Numbers:");
        for (int i = a; i < b; i++) {
            System.out.print(i + " ");
        }
    }
}
