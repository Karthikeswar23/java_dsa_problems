import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int num =1;
		System.out.println("Basic pattern");
		for(int i =1;i<=n;i++){
		    for(int j=1;j<=n;j++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
		System.out.println("Basic number rectangle");
		for(int i =1;i<=n;i++){
		    for(int j=1;j<=n;j++){
		        System.out.print(num+" ");
		        num++;
		    }
		    System.out.println();
		}
		for(int i =1;i<=n;i++){
		    for(int j=1;j<=n-i+1;j++){
		        System.out.print("*");
		    }
		    System.out.println();
		}
		for(int i =0; i<n; i++) {
			for(int j=0; j<n; j++) 
				if (j>=n-i-1) System.out.print("*");
				else System.out.print(" ");
			System.out.println();
		}
		for(int i =0; i<n; i++) {
			for(int j=0; j<n; j++) 
				if (j>=n-i) System.out.print(" ");
				else System.out.print("*");
			System.out.println();
		}
	}
}