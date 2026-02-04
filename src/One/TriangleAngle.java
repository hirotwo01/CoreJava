import java.util.Scanner;

public class TriangleAngle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the angles of a triangle");
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int triangle=a+b+c;
        if(triangle==180){
            System.out.println("triangle is valid");
        }
        else{
            System.out.println("triangle is not valid");
        }
    }
}
