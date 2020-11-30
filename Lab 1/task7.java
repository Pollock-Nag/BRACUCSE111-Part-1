import java.util.Scanner;
public class task7{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    for(int r=1;r<=n1;r++){
      for(int c=1;c<=n2;c++){
        if(r==1||r==n1||c==1||c==n2){
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