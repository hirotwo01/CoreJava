import java.util.Scanner;
public class rectangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter length:");
        int l= sc.nextInt();
        System.out.println("enter breadth:");
        int b= sc.nextInt();
        System.out.println("area:"+l*b);
        System.out.println("perimeter:"+2*(l+b));

    }
}
