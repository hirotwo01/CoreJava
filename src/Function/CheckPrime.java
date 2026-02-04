package Function;

public class CheckPrime {
    public boolean checkPrime(int num){
        boolean isPrime=true;
        if (num <= 1) {
            return false;
        }
        for(int i=2;i<num;i++)
        {
            if(num%i==0){
                isPrime=false;
                break;
            }
        }
        return isPrime;
    }
}
