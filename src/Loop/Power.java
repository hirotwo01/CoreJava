import java.util.Scanner;

public class Power {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter base and power");
        int base= sc.nextInt();
        int power= sc.nextInt();
        int ans=1;
        for(int i=1;i<=power;i++){
            ans=base*ans;
        }
        System.out.println(ans);
    }
}
