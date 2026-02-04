package Function;

public class Palindrome {
    public boolean isPalindrome(int n){
        if(n<0||(n%10==0&&n==0)){
            return false;
        }
        int reversed = 0;
        while (n > reversed) {
            reversed = reversed*10+n%10;
            n=n/10;
        }
        if(reversed==n||reversed/10==n){
            return true;
        }
        else{
            return false;
        }
    }
}