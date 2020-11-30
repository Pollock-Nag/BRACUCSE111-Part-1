import java.util.Scanner;
public class File2Task8{
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int []array=new int[10];
    int []count=new int[10];
    for(int a=0;a<array.length;a++)
    {
      array[a]=sc.nextInt();
      if(array[a]<0 || array[a]>9)
      {
        System.out.println("out of range");
        a--;
      }
    }
    for(int a=0;a<array.length;a++)
    {
      for(int b=0;b<array.length;b++)
      {
        if(array[a]==b)
        {
          count[b]++;
        }
      }
    }
    for(int a=0;a<array.length;a++)
    {
      if(count[a]>=2 && count[a]<=4)
      {
        System.out.print(a+",");
      }
    }
    System.out.println();
    sc.close();
  }
}