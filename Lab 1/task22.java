import java.util.Scanner;
public class task22{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int r=1;r<=n;r++){
      for(int c=1;c<=r;c++ ){
        if(c==1||c==r||r==n){
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