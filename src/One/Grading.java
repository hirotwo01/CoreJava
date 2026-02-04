import java.util.Scanner;
public class Grading {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int total =0;
        int[] arr =new int[6];
        for(int i=1;i<=5;i++){
            System.out.println("Enter marks in subject"+i);
            arr[i] = sc.nextInt();
            if(arr[i]>100||arr[i]<0){
                System.out.println("Invalid number!! enter again");
                return ;
            }
            else{
                total= total+arr[i];
            }

        }
        float percentage=((float) total / 500)*100;
        if(percentage>90) System.out.println("marks/grade:" +total);
        else if(percentage>80) System.out.println("grade/marks/percentage:A+  "+total +percentage);
        else if(percentage>70) System.out.println("grade/marks/percentage:A  "+total  +percentage);
        else if(percentage>60) System.out.println("grade/marks/percentage:B+  "+total  +percentage);
        else if(percentage>50) System.out.println("grade/marks/percentage:B  "+total  +percentage);
        else if(percentage>40) System.out.println("grade/marks/percentage:C+  "+total  +percentage);
        else System.out.println("FAIL");


    }
}
