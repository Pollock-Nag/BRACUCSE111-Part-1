import java.util.Scanner;
public class task12{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    for(int r=1;r<=n;r++){
      for(int b=1;b<=n-r;b++){
        System.out.print(" ");
      }
      for(int c=n-r+1;c<=n;c++){
        System.out.print(c);
      }
      System.out.println();
    }
  }
}