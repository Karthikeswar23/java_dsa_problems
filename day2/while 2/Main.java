import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    int count=0;
	    while (n>0){
	        int a=n%10;
	        System.out.print(a);
	        n=n/10;
	        count++;
	    }
	   // String valstr = val.toString();
	   // System.out.print("Length:"+valstr.length());
	   
	}
}
