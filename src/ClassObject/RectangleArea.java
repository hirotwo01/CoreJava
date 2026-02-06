package ClassObject;

import java.util.Scanner;
public class RectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r = new Rectangle();
        System.out.print("Enter length: ");
        int l = sc.nextInt();
        System.out.print("Enter breadth: ");
        int b = sc.nextInt();
        r.setDim(l, b);
        int area = r.getArea();
        System.out.println("Area of Rectangle = " + area);
    }
}

