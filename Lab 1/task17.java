import java.util.Scanner;
public class task17{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    for(int r=1;r<=n;r++){
      for(int c=1;c<=r;c++){
        System.out.print("*");
      }
      System.out.println();
    }
  }
}
