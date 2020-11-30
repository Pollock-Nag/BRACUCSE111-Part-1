import java.util.Scanner;
public class Task7a {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        System.out.println("Enter another String To compare");
        String anotherString = sc.nextLine();
        System.out.println(str.compareTo(anotherString));
    }
}
