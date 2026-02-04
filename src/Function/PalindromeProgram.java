package Function;

import java.util.Scanner;

public class PalindromeProgram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        Palindrome p=new Palindrome();
        boolean pali=p.isPalindrome(n);
        System.out.println(pali);
    }
}
