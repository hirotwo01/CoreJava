package ClassObject;

import java.util.Scanner;

public class Average {
    void printavg(double a,double b,double c){
        double avg= (a+b+c)/3;
        System.out.println("Average:"+avg);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the three numbers:");
        int a= sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        Average a1=new Average();
        a1.printavg(a,b,c);
    }
}
