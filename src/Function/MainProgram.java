package Function;

public class MainProgram {
    public static void  main(String[] args){
        MainProgram mp = new MainProgram();
        mp.display();
        String weee= mp.display2();
        System.out.println(weee);
    }
    public void display(){
        System.out.println("im called");
    }
    public String display2(){
        return "im also called";
    }
}