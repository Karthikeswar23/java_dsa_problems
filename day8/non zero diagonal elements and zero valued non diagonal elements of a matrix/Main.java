// import java.util.*;
// public class Main
// {
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		int n = sc.nextInt();
// 		int m = sc.nextInt();
// 		int[][] a= new int[n][m];
// 		for(int i =0; i<n; i++) {
// 			for(int j =0; j<m; j++) {
// 				a[i][j]=sc.nextInt();
// 			}
// 		}
// 		int cnt=0;
// 		System.out.println("output");
// 		for(int i =0; i<n; i++) {
// 			for(int j =0; j<m; j++) {
// 				if((i==j || j==n-i-1) && a[i][j]!=0) {
// 				System.out.print(a[i][j]);
// 				}
// 			}
// 			System.out.println();
// 		}
// 	}
// }

import java.util.*;
public class Main
{
	public static boolean diagonal(int[][] a,int n, int m) {
		for(int i =0; i<n; i++) {
			for(int j =0; j<m; j++) {
				if((i==j || j==n-i-1) && a[i][j]==0) {
					return false;
				}
				else if(((i!=j && j!=n-i-1 && a[i][j]!=0))){
				    return false;
				}
			}
		}
		return true;
	}
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
		System.out.println(diagonal(a,n,m));
	}
}