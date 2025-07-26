import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		for(int i =0;i<n;i++){
		    for(int j=0;j<n;j++){
		      if(j==n-1) System.out.print(i+1+" ");
		      else if(j==n-i-1) System.out.print(1+" ");
		      else if(i==n-1) System.out.print(j+1+" ");
		      else System.out.print("  ");
		    }
		    System.out.println();
		}
	}
}