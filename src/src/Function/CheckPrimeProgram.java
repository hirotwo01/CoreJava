package Function;

import java.util.Scanner;

public class CheckPrimeProgram {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        CheckPrime cp=new CheckPrime();
        System.out.println("Enter the number:");
        int num= sc.nextInt();
        boolean prime=cp.checkPrime(num);
        if(prime){
            System.out.println("it is a prime");
        }
        else{
            System.out.println("it is not a prime");
        }

    }
}
