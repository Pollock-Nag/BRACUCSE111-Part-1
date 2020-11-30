import java.util.*;
public class File2Task2{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] a = new int[10]; 
    for(int i=0;i<=a.length-1;i++){
      a[i]= sc.nextInt();
      System.out.println("You have entered "); 
      for(int j=0;j<=i;j++){
        System.out.print(a[j]+" , ");
      }
      System.out.println();
    }
  }
}

