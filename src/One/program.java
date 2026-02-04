import java.util.Scanner;
public class program {
    public static void main(String[] args){
        Scanner pdt= new Scanner(System.in);
        int int1;
        boolean bool1;
        short short1;
        long long1;
        float float1;
        double double1;
        char char1;
        byte byte1;
        System.out.println("Enter a byte value");
        byte1 = pdt.nextByte();
        System.out.println("Enter a int value");
        int1 = pdt.nextInt();
        System.out.println("Enter a bool value");
        bool1 = pdt.nextBoolean();
        System.out.println("Enter a short value");
        short1 = pdt.nextShort();
        System.out.println("Enter a long value");
        long1 = pdt.nextLong();
        System.out.println("Enter a float value");
        float1 = pdt.nextFloat();
        System.out.println("Enter a double value");
        double1 = pdt.nextDouble();
        pdt.nextLine();
        System.out.println("Enter a character value");
        char1 = pdt.nextLine().charAt(0);

        System.out.println(+byte1);
        System.out.println(+int1);
        System.out.println(bool1);
        System.out.println(+short1);
        System.out.println(+long1);
        System.out.println(+float1);
        System.out.println(+double1);
        System.out.println(+char1);
    }
}
