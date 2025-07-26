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
	    int s=sc.nextInt();
	    int[] a = new int[s];
	    for(int i=0;i<a.length;i++){
	        a[i]=sc.nextInt();
	    }
	    for(int v: a){
	        System.out.print(v+" ");
	    }
	}
}