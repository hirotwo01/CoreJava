package Loop;
public class Pattern {
    public static void main(String[] args){
        int count=0;
        for(int i=1;i<=5;i++){
            count++;
            for (int j =i; j<5;j++){ count++;
                System.out.print(" ");
            }
            for (int k=1;k<=(2*i)-1;k++) { count++;
              if(k>i){
                  System.out.print((k-(2*i))* -1);
              }
              else{
                  System.out.print(k);
              }
            }
            System.out.println();
        }
        System.out.println(count);
    }

}
