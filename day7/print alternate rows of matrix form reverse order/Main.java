/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

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
	    for(int i =n-1;i>=0;i-=2){
	        for(int j =0;j<m;j++){
	            System.out.print(a[i][j]+" ");
	        }
	        System.out.println();
	    }
	}
}