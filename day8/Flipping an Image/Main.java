/******************************************************************************
Problem Title: Flipping an Image
Problem Statement: Given a binary matrix containing only 0s and 1s, perform two operations:
Flip horizontally by reversing each row.
Invert by changing 0 to 1 and 1 to 0.
Return the resulting matrix.
Example:
Input:
1 1 0
1 0 1
0 0 0
Output:
1 0 0
0 1 0
1 1 1

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
	    for(int i =0;i<n;i++){
	        for(int j =m-1;j>=0;j--){
	            System.out.print(a[i][j]==0 ? 1+" ":0+" ");
	        }
	        System.out.println();
	    }

	}
}




