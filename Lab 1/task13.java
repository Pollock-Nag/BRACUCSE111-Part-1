import java.util.Scanner;
public class task13{
  public static void main(String[] args){
    Scanner sc =new Scanner(System.in);
    int n =sc.nextInt();
    for(int x=1;x<=n;x++){
      System.out.print(x);
    }
      for(int y=n-1;y>=1;y--){
        System.out.print(y);
      }
    }
  }
