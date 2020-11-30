import java.util.*;
public class File2Task8Repet{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] a =new int[10];
    int[] count=new int[10];
    for(int i=0;i<=a.length-1;i++){
      a[i]= sc.nextInt();
      
      if(a[i]<0||a[i]>9){
        System.out.println("Invalid number");
        i--;
      }
    }
    
    for(int i=0;i<=a.length-1;i++){
      for(int j=0;j<=a.length-1;j++){
        if(a[i]==j)
          count [j]++;
      }
    }
    for(int i=0;i<=a.length-1;i++){
      if(count[i]>=2 && count[i]<5){
        System.out.print(i+" , ");
      }
    }
    System.out.println();
    //sc.close();
  }
}
