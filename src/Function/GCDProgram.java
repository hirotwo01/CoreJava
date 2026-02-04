package Function;

import java.util.Scanner;

public class GCDProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        GCD g = new GCD();
        int result = g.findGCD(a, b);
        System.out.println("GCD = " + result);
        sc.close();
    }
}
