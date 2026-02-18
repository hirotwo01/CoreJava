package test;

import java.util.Scanner;

public class EngtoNep {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number in english:");
        String num= sc.nextLine();
        /*
० = 0
१ = 1
२ = 2
३ = 3
४ = 4
५ = 5
६ = 6
७ = 7
८ = 8
९ = 9
         */
        String result ="";
        for(int i=0;i<num.length();i++){

            switch(num.charAt(i)){
                case '0':
                    result+='०';
                    break;
                case '1':
                    result+='१';
                    break;
                case '2':
                    result+='२';
                    break;
                case '3':
                    result+='३';
                    break;
                case '4':
                    result+='४';
                    break;
                case '5':
                    result+='५';
                    break;
                case '6':
                    result+='६';
                    break;
                case '7':
                    result+='७';
                    break;
                case '8':
                    result+='८';
                    break;
                case '9':
                    result+='९';
                    break;
                default:
                    System.out.println("no valid char!");
            }
        }
        System.out.println("Number converted to nepali:"+result);
    }

}
