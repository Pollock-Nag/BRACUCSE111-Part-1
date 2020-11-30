import java.util.*;
public class File2Task4{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] a = new int[5];
    for(int i=0;i<=a.length-1;i++){
      a[i]= sc.nextInt();
      int count=0;
      for(int j=0;j<=a.length-1;j++){
        if(a[i]==a[j]){
          count++;
        }
      }
      if(count>1){
        System.out.println("Duplicate! please try an unique number" );
        i--;
      }
    }
    for(int p=0;p<=a.length-1;p++){
    System.out.print(a[p]+" , ");
    }
  }
}