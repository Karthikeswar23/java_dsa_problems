import java.util.*;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		String[] b=new String[n];
		int cnt=0,max=0;
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
			if(a[i]==0) cnt=0;
			else 
			cnt=cnt+1;
			if (cnt>max){
			    max=cnt;
			}
		}
		System.out.print(max);
	}
}
