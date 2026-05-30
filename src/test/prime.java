package test;
//	WAP that check a prime number boolean checkPrime(int testNumber)
//	WAP that displays all the prime numbers between 1 and 1000. Use the above checkPrime function to identify the prime number.

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number:");
        int a= sc.nextInt();
        primecheck obj=new primecheck();
        if(obj.checkPrime(a)){
            System.out.println(a+" is a prime number");
        }
        else {
            System.out.println(a+" is not a prime number");
        }

    }
}
