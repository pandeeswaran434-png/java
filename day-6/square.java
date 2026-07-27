package day6;

public class square {
    public static void main(String[] args){
        for(int i=1;i<=5;i++){
          int n=i;
          for(int j=1;j<=5;j++){
              System.out.print(n+" ");
              n=n+5-j;
          }
          System.out.println();
        }
    }
}
