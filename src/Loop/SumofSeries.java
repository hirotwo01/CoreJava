package Loop;

import java.util.Scanner;

public class SumofSeries {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number n:");
    int n=sc.nextInt();
    int sum=0;
    int num=0;
    for(int i=1;i<=n;i++){
        num=num*10+2;
        sum=sum+num;
    }
        System.out.println("Sum="+sum);
    }
}
