package Function;

import java.util.Scanner;

public class Product {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Product p = new Product();
        System.out.println("Enter first and second number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = p.product(a, b);
        System.out.println(c);
    }

    public int product(int a, int b) {
        return a * b;
    }
}
