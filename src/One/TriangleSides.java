package One;

import java.util.Scanner;

public class TriangleSides {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the three sides:");
        int a =sc.nextInt();
        int b =sc.nextInt();
        int c =sc.nextInt();
        if (a==b && a==c){
            System.out.println("It is an equatorial triangle");

        }
        else if (a==b||a==c){
            System.out.println("It is an isosceles triangle");
        }
        else {
            System.out.println("It is a scalene triangle");
        }

    }
}
