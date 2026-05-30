package test;

import java.util.Scanner;

public class NumToWords {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String[] units={"","one", "two","three","four","five","six","seven","eight","nine","ten","eleven","twelve"
                ,"thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen"
        };
        String[] tens={
                "","","twenty","thirty","forty","fifty","sixty","seventy","eighty","ninety"
        };
        System.out.println("Enter the number");
        long num= sc.nextLong();
        String result ="";
        if(num==0){
            result="zero";
        }
        while(num>0){
            if(num>=100000000){
                if (num/1000000>19){
                    result+=tens[(int) (num/1000000)]+"crore";
                    result+=units[(int) (num/1000000)]+"crore";
                }
                result+=units[(int) (num/1000000)]+"crore";
                System.out.println(result);
            }
        }
    }
}
