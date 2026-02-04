package Function;
import java.util.Scanner;
public class RangeDisplayProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting and ending number:");
        int start = sc.nextInt();
        int end = sc.nextInt();
        RangeDisplay r = new RangeDisplay();
        r.display(start, end);
    }
}
