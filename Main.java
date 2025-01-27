
import java.util.*;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the String : " );
        String ans = sc.nextLine();
        System.out.print("String is : " );
	    for(int i = 0; i < ans.length(); i++){
	      System.out.print(ans.charAt(i));
	    }
	    String modifiedString = ans.replace("@", " ").toUpperCase();
	    System.out.println("");
	    System.out.print("After upperCase the String is : " + modifiedString);
	}
}
