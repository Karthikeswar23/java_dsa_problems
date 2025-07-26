import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int cnt=0;
		int[] a = new int[size];
		int[] b = new int[size];
		for(int i=0; i<size; i++) {
			a[i]=sc.nextInt();
			if(a[i]==0){
			    System.out.print(0+" ");
			}
		}
		for(int i=0; i<size; i++) {
			if(a[i]!=0){
			    System.out.print(a[i]+" ");
			}
		}
	}
}
