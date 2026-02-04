package Loop;
public class Pattern1 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int s = i; s < n; s++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(i);
            }
            for (int k = 2; k <= i; k++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
