package ClassObject;

public class Employee {
    String name;
    int yearOFJoining;
    long salary;
    String address;

    public static void main(String[] args) {
        Employee e=new Employee();
        e.name="Robert";
        e.yearOFJoining=1994;
        e.salary=35000;
        e.address="64C-WallStreat";
        System.out.println("Name:"+e.name);
        System.out.println("Year of joining:"+e.yearOFJoining);
        System.out.println("salary:"+e.salary);
        System.out.println("address:"+e.address);
        Employee e1=new Employee();
        e1.name="Sam";
        e1.yearOFJoining=2000;
        e1.salary=400000;
        e1.address="68d-WallStreat";
        System.out.println("Name:"+e1.name);
        System.out.println("Year of joining:"+e1.yearOFJoining);
        System.out.println("salary:"+e1.salary);
        System.out.println("address:"+e1.address);
        Employee e2=new Employee();
        e2.name="John";
        e2.yearOFJoining=1999;
        e2.salary=350000;
        e2.address="26B-WallStreat";
        System.out.println("Name:"+e2.name);
        System.out.println("Year of joining:"+e2.yearOFJoining);
        System.out.println("salary:"+e.salary);
        System.out.println("address:"+e.address);

    }
}
