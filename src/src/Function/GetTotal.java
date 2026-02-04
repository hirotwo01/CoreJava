package Function;

import java.util.Scanner;

public class GetTotal {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        GetTotal gt= new GetTotal();
        System.out.println("enter two numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c= gt.getTotal(a,b);
        System.out.println(c);
    }
    public int getTotal(int a, int b){
        return a+b;
    }
}
