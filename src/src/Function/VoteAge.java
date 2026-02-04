package Function;

import java.util.Scanner;

public class VoteAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your age: ");
        int age = sc.nextInt();
        if (isEligible(age)) {
            System.out.println("eligible to vote.");
        } else {
            System.out.println("not eligible to vote.");
        }
    }
    public static boolean isEligible(int age) {
        return age >= 18;
    }
}
