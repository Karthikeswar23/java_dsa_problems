import java.util.*;
import java.util.Arrays;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int[] a = new int[n];
	    for(int i=0;i<n;i++){
	        a[i]=sc.nextInt();
	    }
	   // int min=a[0],index=0;
	   // for(int i=0;i<n;i++){
	   //     if(a[i]<min){
	   //         min=a[i];
	   //         index=i;
	   //     }
	   // }
	   // int max=a[index];
	   // for(int i=index;i<n;i++){
	   //     if(a[i]>max){
	   //         max=a[i];
	   //     }
	   // }
	   int min=a[0],max=0;
	   for(int i=0;i<a.length;i++){
	       if(a[i]<min){
	           min=a[i];
	       }
	       else if(a[i]-min > max){
	           max=a[i]-min;
	       }
	   }
	    System.out.print(max);
	}
}
