import java.util.Scanner;
public class task23{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int r=n;r>=1;r--){
      for(int c=1;c<=n;c++ ){
        if(c==n||c==r||r==1){
          System.out.print("*");
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}