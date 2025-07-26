/******************************************************************************
Problem Title: Sum of Border Elements of Alternate Rows
Problem Statement: Calculate the sum of the first and last element of every alternate row (even-indexed only).
Assume each row has at least two columns.
Example:
Input:
1 2 3
4 5 6
7 8 9
Output: 
20
Explanation:
1 + 3 + 7 + 9 = 20

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int m = sc.nextInt();
	    int[][] a= new int[n][m];
	    for(int i =0;i<n;i++){
	        for(int j =0;j<m;j++){
	            a[i][j]=sc.nextInt();
	        }
	    }
	    System.out.println("output");
	    int sum=0;
	    for(int i =0;i<n;i++){
	        for(int j =0;j<m;j++){
	            if(i%2==0 && (j==0 || j==n-1))
	            sum +=a[i][j];
	        }
	    }
	        System.out.println(sum);

	}
}