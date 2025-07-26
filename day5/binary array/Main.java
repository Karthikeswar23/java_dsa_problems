import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] a = new int[size];
		for(int i=0; i<size; i++) {
			a[i]=sc.nextInt();
			a[i]%=2;
		}
		for(int v:a) {
			System.out.print(v+" ");
		}
	}
}
