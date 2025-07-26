/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Arrays;
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a=new int[n*2];
		int[] b=new int[n*2];
		for(int i=0; i<n*2; i++) {
			a[i]=sc.nextInt();
		}
		for(int i=n; i<n*2; i++) {
			b[2*i]=a[i];
			b[2*i+1]=a[i+n];
		}
	System.out.print(Arrays.toString(b));
	}
}