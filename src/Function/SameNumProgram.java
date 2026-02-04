package Function;

import java.util.Scanner;

public class SameNumProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        SameNum sn = new SameNum();
        boolean result = sn.isSameNum(num1, num2);
        System.out.println("Result:" + result);
    }
}
