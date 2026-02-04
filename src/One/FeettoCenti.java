import java.util.Scanner;
public class FeettoCenti {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter height in feets(eg 5.11)");
        float height = sc.nextFloat();
        float cm = height * 30.48f;
        System.out.println("height in cm="+cm);

        if(cm>160){
            System.out.println("you are tall");
        }
        else{
            System.out.println("you are NOT tall");
        }

    }
}
