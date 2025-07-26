import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] a= new int[n][m];
		for(int i =0; i<n; i++) {
			for(int j =0; j<m; j++) {
				a[i][j]=sc.nextInt();
			}
		}
		int cnt=0;
		System.out.println("output");
		for(int i =0; i<n; i++) {
			cnt=0;
			for(int j =0; j<m; j++) {
				if(a[i][j]%2==1) {
					a[i][j]=1;
					cnt+=1;
				}
				else {
					a[i][j]=0;
				}
				
				System.out.print(a[i][j]+" ");
			}
			System.out.print("="+" "+cnt);
			System.out.println();
		}
	}
}