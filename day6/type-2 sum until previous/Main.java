import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] a= new int[n];
	    int sum=a[0];
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt(); 
	        sum+=a[i];
	        System.out.print(sum+" ");
	    }
	}
}