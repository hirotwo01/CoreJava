package Function;

import java.util.Scanner;

public class NumLengthProg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        NumLength n=new NumLength();
        int result=n.Length(num);
        System.out.println("Length of the given number is "+result);
    }
}
