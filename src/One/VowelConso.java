import java.util.Scanner;
public class VowelConso {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a character:");
        char c= sc.nextLine().charAt(0);

        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            System.out.println("It is a Vowel");
        }
        else{
            System.out.println("It is a Consonant");
        }
    }
}
