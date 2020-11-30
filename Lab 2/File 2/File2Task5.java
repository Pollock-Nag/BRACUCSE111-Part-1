import java.util.*;
public class File2Task5{
  public static void main(String[] args){
    Scanner sc = new Scanner (System.in);
    double i = 0;
    System.out.println("Please enter the value of E");
    int e = sc.nextInt();
    System.out.println("Please enter the value of R");
    int r = sc.nextInt();
    System.out.println("Please enter the value of L");
    int l = sc.nextInt();
    System.out.println("Please enter the value of C");
    int c = sc.nextInt();
    System.out.println("Please enter the value of F");
    int f = sc.nextInt();
    
    i=(e/Math.sqrt((r*r)+(((2*3.1416*f*l)-(1/(2*3.1416*f*c)))*((2*3.1416*f*l)-(1/(2*3.1416*f*c))))));
    System.out.println("Current = "+i+" apm");
  }
}