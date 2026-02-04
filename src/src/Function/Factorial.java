package Function;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to get factorial:");
        int n=sc.nextInt();
        Factorial gf= new Factorial();
        int fact= gf.getFactorial(n);
        System.out.println("factorial:" + fact);
    }
    public int getFactorial(int n){
        int fact = 1;
        for (int i = 1; i <=n; i++) {
            fact = fact * i;

        }
        return fact;
    }
}
