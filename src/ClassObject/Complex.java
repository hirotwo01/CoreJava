package ClassObject;

import java.util.Scanner;

public class Complex {
    double real;
    double imag;
    Complex(double r, double i){
        real=r;
        imag=i;
    }
    void sum(Complex c){
        double r= real + c.real;
        double i= imag+c.imag;
        System.out.println("Sum="+r+"+"+i+"i");
    }
    void difference(Complex c){
        double r= real - c.real;
        double i= imag -c.imag;
        System.out.println("Sum="+r+"+"+i+"i");
    }
    void product(Complex c){
        double r=(real*c.real)-(imag*c.imag);
        double i=(real*c.imag)+(imag*c.real);
        System.out.println("Product="+r+"+"+i+"i");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter real and imaginary part of first number:");
        double r1 = sc.nextDouble();
        double i1 = sc.nextDouble();
        System.out.println("Enter real and imaginary part of second number:");
        double r2 = sc.nextDouble();
        double i2 = sc.nextDouble();
        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);
        c1.sum(c2);
        c1.difference(c2);
        c1.product(c2);
    }
}
