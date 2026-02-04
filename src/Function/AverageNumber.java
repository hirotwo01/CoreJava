package Function;

import java.util.Scanner;

public class AverageNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter second number:");
        int num2 = sc.nextInt();
        System.out.println("Enter third number:");
        int num3 = sc.nextInt();
        AverageNumber an = new AverageNumber();
        an.averageNumber(num1, num2, num3);
    }
    public void averageNumber(int num1, int num2, int num3) {
        double avg = (num1 + num2 + num3) / 3.0;
        int highest = num1;
        if (num2 > highest) {
            highest = num2;
        }
        if (num3 > highest) {
            highest = num3;
        }
        int lowest = num1;
        if (num2 < lowest) {
            lowest = num2;
        }
        if (num3 < lowest) {
            lowest = num3;
        }
        System.out.println("Average = " + avg);
        System.out.println("Highest = " + highest);
        System.out.println("Lowest = " + lowest);
    }
}
