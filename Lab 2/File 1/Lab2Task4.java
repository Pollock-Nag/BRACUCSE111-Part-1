import java.util.*;
public class Lab2Task4{
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    int[] a = new int[10];
      for(int i=0;i<=a.length-1;i++){
      a[i]= sc.nextInt();
    }
      for(int i=a.length-1;i>=0;i--){
        if(a[i]%2==0){
      System.out.print(a[i]+" , ");
    }
  }
}
}