package Function;

import java.util.Scanner;

public class Sum1Program {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the frist second and third number:");
        int num1=sc.nextInt();
        int num2 =sc.nextInt();
        int num3= sc.nextInt();
        Sum1 s= new Sum1();
        int sum=s.Sum(num1,num2,num3);
        System.out.println("The sum of 3 number is:"+sum);
    }
}
