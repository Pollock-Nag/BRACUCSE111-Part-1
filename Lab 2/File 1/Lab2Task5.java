import java.util.*;
public class Lab2Task5{
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    int[] a = new int[10];
    for(int i=0;i<=a.length-1;i++){
      a[i]=sc.nextInt();
    }
    System.out.println("Please put another number");
    int n = sc.nextInt();
    int count=0;
    
    for(int i=0;i<=a.length-1;i++){
      if(a[i]==n){
        count=1;
      }
    }
    if( count==1){
      System.out.println("Y");
    }
    else{
      System.out.println("N");
    }
  }
}