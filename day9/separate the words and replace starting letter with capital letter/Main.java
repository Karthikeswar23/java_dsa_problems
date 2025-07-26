import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    String[] sa= str.trim().split(" ");
	    for(int i=0,j=1;i<sa.length;i++){
	           System.out.println(Character.toUpperCase(sa[i].charAt(0))+sa[i].substring(1));
	    }
	    System.out.print(sa.length);
    }
}