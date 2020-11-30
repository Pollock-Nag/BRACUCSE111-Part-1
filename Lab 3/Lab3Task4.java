import java.util.Scanner;
public class Lab3Task4{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    int s[] = new int[91];
    String input = sc.nextLine();
    for(int k = 65; k<s.length; k++){
      for(int i = 0; i < input.length(); i++){
        int ch = input.codePointAt(i);
        if(k== ch){
          s[k]++;
        }
      }
    } 
    for(int i = 65; i<s.length;i++){
      char ch = (char)i;
      System.out.println(ch+" which is "+i+" was found "+s[i]+" times"); 
    }
  }
}