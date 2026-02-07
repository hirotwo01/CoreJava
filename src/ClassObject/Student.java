package ClassObject;

public class Student {
    String name;
    int roll_no;
    String phone;
    String address;
    public static void main(String[] args) {
        Student s= new Student();
        s.name="john";
        s.roll_no=2;
        s.phone="1234567890";
        s.address="kathmandu";
        System.out.println("name:"+s.name);
        System.out.println("Roll no:"+s.roll_no);
        System.out.println("phone number:"+s.phone);
        System.out.println("Address:"+s.address);
        Student s1=new Student();
        s1.name="Sam";
        s1.roll_no=1;
        s1.phone="0987654321";
        s1.address="bhaktapur";
        System.out.println("name:"+s1.name);
        System.out.println("Roll no:"+s1.roll_no);
        System.out.println("phone number:"+s1.phone);
        System.out.println("Address:"+s1.address);

    }


}
