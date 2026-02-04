
import java.util.Scanner;
public class calci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number:");
        int a = sc.nextInt();

        System.out.println("enter second number: ");
        int b = sc.nextInt();

        if (a <= 0 || b <= 0) {
            System.out.println("invalid input!");
        } else {
            System.out.println("sum = " + (a + b));
            System.out.println("product = " + (a * b));
            System.out.println("difference = " + (a - b));
            System.out.println("quotient = " + (a / b));
            System.out.println("remainder = " + (a % b));
        }
    }

}
