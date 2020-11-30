import java.util.Scanner;
public class task21{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    for(int r=1;r<=n1;r++){
      for(int c=1;c<=n2;c++){
        if(c==1|c==n2||r==1||r==n1){
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