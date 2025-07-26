import java.util.*;
import java.util.Arrays;
public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int[] a =new int[3];
		int n=0;
		for (int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
			n=n*10+a[i];
		}
		n=n+1;
		String s =Integer.toString(n);
		int[] res =new int[s.length()];
		for (int i = 0; i<s.length(); i++) {
			res[i] = s.charAt(i) - '0';
		}
		System.out.println(Arrays.toString(res));
	}
}