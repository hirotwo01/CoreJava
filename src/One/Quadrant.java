import java.util.Scanner;
public class Quadrant {
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter x coordinate");
        int x= sc.nextInt();
        System.out.println("enter y coordinate");
        int y= sc.nextInt();
        if(x>0&&y>0){
            System.out.println("Q1");
        }
        else if(x<0&&y>0) {
            System.out.println("Q2");
        }
        else if(x<0&&y<0){
            System.out.println("Q3");
        } else if (x>0&&y<0) {
            System.out.println("Q4");
        }
        else{
            System.out.println("origin");
        }

    }
}
