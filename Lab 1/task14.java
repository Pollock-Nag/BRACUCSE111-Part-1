import java.util.Scanner;
public class task14{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    for(int r=1;r<=n;r++){
      for(int b =1; b<=n-r;b++){
        System.out.print(" ");
      }
      for(int x=1;x<=r;x++){
        System.out.print(x);
      }
      for(int y=r-1;y>=1;y--){
        System.out.print(y);
      }
      System.out.println();
    }
  }
}
