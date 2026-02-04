package Function;

import java.util.Scanner;

public class RangeDisplayOddProg {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the starting and ending number:");
        int start= sc.nextInt();
        int end=sc.nextInt();
        RangeDisplayOdd rd= new RangeDisplayOdd();
        rd.displayOddNumbers(start, end);
    }

}
