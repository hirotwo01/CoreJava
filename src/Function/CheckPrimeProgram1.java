//13.	WAP that displays all the prime numbers between 1 and 1000. Use the above checkPrime function to identify the prime number.
package Function;

public class CheckPrimeProgram1 {
    public static void main(String[] args){
        CheckPrime cp=new CheckPrime();
        for(int i=0;i<=1000;i++)
        {
            boolean prime=cp.checkPrime(i);
            if (prime){
                System.out.print(i+ " ");

            }

        }
    }

}
