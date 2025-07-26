import java.util.*;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		String[] b=new String[n];
		int cnt=0;
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
			b[i]=Integer.toString(a[i]);
			if(b[i].length()%2==0) {
				cnt+=1;
			}
		}
		System.out.print(cnt);
	}
}
