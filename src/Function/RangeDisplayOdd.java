package Function;

public class RangeDisplayOdd {
    public void displayOddNumbers(int start, int end){
        for(int i=start;i<=end;i++){
            if(i%2!=0) {
                System.out.print(i);
            }
        }
    }
}
