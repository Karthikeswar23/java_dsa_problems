import java.util.*;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int[] a=new int[6];
	    int[] b=new int[6];
	    int cnt=0;
	    for(int i=0;i<a.length;i++){
	        a[i]=sc.nextInt();
	        b[i]=a[i];
	    }
	    Arrays.sort(a);
	    for(int i=0;i<a.length;i++){
	        if(a[i]!=b[i]) cnt+=1;
	    }
	    System.out.println(cnt);
	}
}