package ClassObject;

import java.util.Scanner;

public class Area {
    int length;
    int breadth;
    Area(int l,int b){
       length=l;
       breadth=b;
    }
    int returnArea(){
        return length*breadth;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length and breadth:");
        int l=sc.nextInt();
        int b=sc.nextInt();
        Area a=new Area(l,b);
        int area=a.returnArea();
        System.out.println("Area:"+area);
    }
}
