import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    String now = "";
	    for(int i=0;i<str.length();i++){
	        if ("aeiou".indexOf(str.charAt(i))>=0){
	            for(int j=0;j<=i;j++){
	                now+=str.charAt(i);
	            }
	        }
	        else{
	            now+=str.charAt(i);
	        }
	    }
	    System.out.print(now);
	}
}
