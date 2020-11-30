import java.util.*;
public class Lab2Task6{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int[] a = new int[15];
    System.out.println("Please input 15 numbers between 1 to 9");
    for(int i=0;i<=a.length-1;i++){
      a[i]= sc.nextInt();
    }
    for(int n=0;n<=9;n++){
      int count=0;
      for(int i=0;i<=a.length-1;i++){
        if(a[i]==n){
          count++;
        }
      }
        System.out.println(n+" => "+count);
      }
    }
  }