import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String now = "";
		for(int i=0; i<str.length(); i++) {
			System.out.print(i%2!=0? Character.toUpperCase(str.charAt(i)):Character.toLowerCase(str.charAt(i)));
		}

	}
}