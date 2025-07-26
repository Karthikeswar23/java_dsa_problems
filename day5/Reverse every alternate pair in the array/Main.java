import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] a= new int[n];
	    int temp=0;
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	    }
	    for(int i=0;i<n-1;i++){
	        temp=a[i];
            a[i]=a[i+1];
	        a[i+1]=temp;
	        i+=3;
	    }
	    for(int v:a){
	        System.out.print(v+" ");
	    }
	}
}