package Function;

import java.util.Scanner;

public class AreaCircumference {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter radius:");
        double r= sc.nextDouble();
        AreaCircumference ac =new AreaCircumference();
        double area= ac.area(r);
        double circumference =ac.circumference(r);
        System.out.println("Area ="+area);
        System.out.println("Circumference="+circumference);


    }
    public double circumference(double r){
        return 2*Math.PI*r;
    }
    public double area(double r){
        return Math.PI*r*r;
    }
}
