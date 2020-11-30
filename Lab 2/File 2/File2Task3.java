import java.util.*;
public class File2Task3{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] a = new int[10];
    int temp=0;
    for(int i=0;i<=a.length-1;i++){
      a[i]= sc.nextInt();
    }
    for(int i=0;i<a.length;i++){
      for(int j=i+1;j<a.length;j++){
        if(a[j]>a[i]){
          temp=a[i];
          a[i]=a[j];
          a[j]=temp;
        }
      }
    }
    for(int p=0;p<=a.length-1;p++){
      System.out.print(a[p]+" , ");
    }
  }
}