package String;

import java.util.Scanner;

public class DistinctChar {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str= sc.nextLine();
        char[] result= new char[str.length()];
        int index=0;
        for(int i=0; i<str.length();i++){
            char current= str.charAt(i);
            boolean isDuplicate = false;
            for (int j=0;j< index; j++)
            {
                if(result[j]==current) {
                    isDuplicate = true;
                    break;
                }
            }
            if(!isDuplicate){
                result[index]=current;
                index++;
            }
            }
        System.out.println("Distinct characters: ");
        for(int i=0;i<index;i++){
            System.out.print(result[i]);
        }
    }
}
