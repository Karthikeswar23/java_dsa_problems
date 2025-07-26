import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    for(int i =str.length()-1;i>=0;i--){
	        System.out.print(str.charAt(i));
	    }
	    System.out.println();
	    StringBuilder str1 = new StringBuilder(sc.nextLine());
	    str1.reverse();
	    System.out.print(str1);
	    
	}
}
