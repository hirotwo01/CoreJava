import java.util.Scanner;
public class EqualorNot {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the firts number");
        int a = sc.nextInt();
        System.out.println("enter the second number");
        int b=sc.nextInt();
        if(a==b){
            System.out.println("the numbers are equal.");
        }
        else{
            System.out.println("the numbers are not equal");
        }
    }
}
