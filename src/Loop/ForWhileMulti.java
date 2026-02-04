import java.util.Scanner;

public class ForWhileMulti {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a positive number:");
        int n=sc.nextInt();
        System.out.println("table using for");
        for (int i=1;i<=10;i++){
            System.out.println(n +"*"+ i+"="+n*i);
        }
        int j=1;
        System.out.println("table using while");
        while(j<=10){
            System.out.println(n +"*"+ j+"="+n*j);
            j++;
        }
    }
}
