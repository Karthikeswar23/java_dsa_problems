import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    String now = "";
	    for(int i=0;i<str.length();i++){
	        if (Character.isUpperCase(str.charAt(i))){
	           now+=Character.toLowerCase(str.charAt(i)); 
	    }
	    else{
	        now+=Character.toUpperCase(str.charAt(i));
	    }
	    
	}
	System.out.print(now);
}
}