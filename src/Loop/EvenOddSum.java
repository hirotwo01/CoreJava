import java.util.Scanner;

public class EvenOddSum {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter N: ");
    int N = sc.nextInt();
    int evenSum = 0;
    int oddSum = 0;
    for (int i = 1; i <= N; i++) {
        if (i % 2 == 0) {
            evenSum = evenSum + i;
        } else {
            oddSum = oddSum + i;
        }
    }
    System.out.println("Sum of Even numbers = " + evenSum);
    System.out.println("Sum of Odd numbers = " + oddSum);
    }
}
