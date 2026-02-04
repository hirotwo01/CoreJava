package Function;

public class NumLength {
    public int Length(int num){
        int length=0;
        while(num>0){
            num=num/10;
            length++;
        }
        return length;
    }
}
