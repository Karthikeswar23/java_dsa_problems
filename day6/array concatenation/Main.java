import java.util.*;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    int[] a = new int[n];
	    int[] b = new int[m];
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	    }
	    for(int i=0;i<m;i++){
	        b[i]=sc.nextInt();
	    }
	    int[] c= Arrays.copyOf(a,n+m);
	    System.out.print(Arrays.toString(c));
	    for(int i=0;i<b.length;i++){
	        c[n+i]=b[i];
	    }
	    System.out.print(Arrays.toString(c));
	}
}