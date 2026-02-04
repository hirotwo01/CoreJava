package Function;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        Sum st = new Sum();
        int sum = st.add(num1, num2);
        System.out.println("Sum = " + sum);
    }
    public int add(int a, int b) {
        return a + b;
    }
}
