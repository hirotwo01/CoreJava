package test;

public class primecheck {

    public boolean checkPrime(int testNumber)
    {
        if(testNumber<=1){
            return false;
        }
            for(int i = 2; i<testNumber; i++)
            {
                if(testNumber%i==0)
                   return false;
            }
                return true;
    }
}
