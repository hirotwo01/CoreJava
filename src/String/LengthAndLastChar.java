package String;

import java.util.Scanner;

public class LengthAndLastChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str =sc.nextLine();
        System.out.println("The length of string is: "+str.length());
        System.out.println("The last character of string is: "+str.charAt(str.length()-1));

    }
}
