import java.util.Scanner;
public class task9{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    for(int r=n;r>=1;r--){
      for(int c=1;c<=n;c++){
        if(r==1||c==n||r==c){
          System.out.print(c);
        }
        else{
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}