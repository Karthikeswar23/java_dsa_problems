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
		for(int i=0; i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0; i<n;i++) {
			for(int j=0;j<n;j++){
			    if(a[i]>a[j]){
			        cnt+=1;
			    }
			}
			System.out.print(cnt+" ");
			cnt=0;
		}
	}
}
