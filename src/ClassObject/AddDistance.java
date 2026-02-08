package ClassObject;

import java.util.Scanner;

public class AddDistance {
    int inch;
    int feet;

    public AddDistance(int f, int i) {
        feet=f;
        inch=i;
    }

    AddDistance addition(AddDistance d){
        int f=feet+d.feet;
        int i=inch+d.inch;
        if(i>=12){
            f=f+(i/12);
            i=i%12;
        }
        return new AddDistance(f,i);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first distance:");
        int f1=sc.nextInt();
        int i1=sc.nextInt();
        System.out.println("Enter second distance:");
        int f2=sc.nextInt();
        int i2=sc.nextInt();
        AddDistance d1=new AddDistance(f1,i1);
        AddDistance d2=new AddDistance(f2,i2);
        AddDistance d3=d1.addition(d2);
        System.out.println("Total distance:"+ d3.feet+" feet "+d3.inch+" inches");
    }
}
