public class ForWhileSum {
    public static void main(String[] args){
        int sum1=0;
        for (int i=1;i<=10;i++)
        {
            sum1=sum1+i;
        }
        System.out.println("Sum using For:");
        System.out.println(sum1);
        int j=1;
        int sum2=0;
        while (j<=10){
            sum2= sum2 +j;
            j++;

        }
        System.out.println("Sum using While");
        System.out.println(sum2);

    }
}
