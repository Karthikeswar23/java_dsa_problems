import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] a = new int[size];
		int[] b = new int[size];
		for(int i=0,j=0; i<size; i++) {
			a[i]=sc.nextInt();
			if(a[i]!=0){
			    b[j++]=a[i];
			}
		}
		for(int v:b){
		    System.out.print(v+" ");
		}
	}
}
