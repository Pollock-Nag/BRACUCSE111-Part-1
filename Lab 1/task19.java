import java.util.Scanner;
public class task19{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    for(int r=1;r<=n;r++){
      for(int b=1;b<=n-r;b++){
        System.out.print(" ");
      }
      for(int c=1;c<=r*2-1;c++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
