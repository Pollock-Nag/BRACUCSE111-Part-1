import java.util.*;
public class Lab3Task3{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    for(int i =0 ;i<s.length();i++){
      int code = s.codePointAt(i);
      System.out.println(s.charAt(i)+" : "+code);
    }
  }
}