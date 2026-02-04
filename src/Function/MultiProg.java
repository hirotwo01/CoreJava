package Function;

import java.util.Scanner;

public class MultiProg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int num=sc.nextInt();
        Multi m=new Multi();
        m.printMultiplication(num);

    }
}
