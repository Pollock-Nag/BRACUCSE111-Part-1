import java.util.*;
public class File2Task6{
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    System.out.println("please input value of n");
    int n = sc.nextInt();
    double y=0;  
      for(int x=0;x<=n;x++){
        if(x%2==0){
          y=y-x*x;
        }
        if(x%2!=0){
          y=y+x*x;
        }
      }
      System.out.println(y);
    }
  }