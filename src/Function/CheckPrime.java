package Function;

public class CheckPrime {
    public boolean checkPrime(int num){
        boolean isPrime=true;
        for(int i=2;i<num;i++)
        {
            if(num%i==0){
                isPrime=false;
            }
        }
        return isPrime;
    }
}
