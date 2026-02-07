package ClassObject;

public class Rectangl {
    int length;
    int breadth;
    Rectangl(int l, int b) {
        length = l;
        breadth = b;
    }
    int area() {
        return length * breadth;
    }
    public static void main(String[] args) {
        Rectangl r1 = new Rectangl(4, 5);
        Rectangl r2 = new Rectangl(5, 8);
        System.out.println("Area of Rectangle 1 = " + r1.area());
        System.out.println("Area of Rectangle 2 = " + r2.area());
    }
}
