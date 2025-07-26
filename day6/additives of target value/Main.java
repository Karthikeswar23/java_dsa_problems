import java.util.*;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		int tar=9,flag=0;
		for(int i=0; i<a.length;i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0; i<n;i++) {
			for(int j=0;j<n;j++){
			    if(a[i]+a[j]==tar){
			        System.out.print(i+" "+j);
			        flag =1;
			        break;
			    }
			}
			if(flag==1){
			        break;
			    }
		}
	}
}
