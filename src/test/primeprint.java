package test;

import java.util.Scanner;

public class primeprint {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the range to print");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int i;
        primecheck obj= new primecheck();
        System.out.println("prime numbers from "+a+" to "+b+":");
        for( i=a;i<=b;i++){

            if(obj.checkPrime(i))
                System.out.print(i+" ");
        }
    }
}
