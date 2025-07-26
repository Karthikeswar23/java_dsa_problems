import java.util.Arrays;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n=sc.nextInt();
	    int[] a= new int[n];
	    int[] b= new int[n];
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	    }
	    for(int i=0;i<n;i++){
	        b[i]=sc.nextInt();
	    }
	    Arrays.sort(a);
	    System.out.println("sorted a "+Arrays.toString(a));
	    System.out.println("check equals :"+Arrays.equals(a,b));
	    int[] c=Arrays.copyOf(b,n-2);
	    System.out.println("copy of b into c "+Arrays.toString(c));
	    System.out.println(Arrays.toString(b));
	    int[] z=Arrays.copyOfRange(a,3,n-1);
	    System.out.println("copy of a into z with range "+Arrays.toString(z));
	    System.out.println("Binary search of 2 :"+Arrays.binarySearch(a,2)+"index");
	    Arrays.asList(b);
	    System.out.println("b to list "+Arrays.toString(b));
	    int[][] l={{1,2},{3,4}};
	    int[][] m={{1,2},{3,4}};
	    System.out.println("deep equals of l and m"+" "+Arrays.deepEquals(l,m));
	}
}
