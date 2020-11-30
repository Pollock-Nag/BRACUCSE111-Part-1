import java.util.Scanner;
public class task6{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    for(int r=1;r<=n;r++){
      for(int b=1;b<=n-r;b++){
        System.out.print(" ");
      }
      for(int c=1;c<=2*r-1;c++){
        System.out.print(c);
      }
      System.out.println();
    }
        for(int r=n-1;r>=1;r--){
      for(int b=1;b<=n-r;b++){
        System.out.print(" ");
      }
      for(int c=1;c<=2*r-1;c++){
        System.out.print(c);
      }
      System.out.println();
    }
  }
}