package Function;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        EvenOdd eo = new EvenOdd();
        boolean result = eo.isEven(num);
        if (result) {
            System.out.println(num + " is Even.");
        } else {
            System.out.println(num + " is Odd.");
        }
    }
    public boolean isEven(int num) {
        return num % 2 == 0;
    }
}
