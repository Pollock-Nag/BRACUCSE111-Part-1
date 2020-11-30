import java.util.Scanner;
public class task2{
  public static void main(String[] args){
    Scanner sc= new Scanner(System.in);
    int n1=sc.nextInt();
    int n2=sc.nextInt();
    for(int r=1;r<=n1;r++){
      for(int c=1;c<=n2;c++){
        System.out.print(c);
      }
      System.out.println();
    }
  }
}
