import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Integer n = sc.nextInt();
	    int sum =0;
	    String valstr = n.toString();
	    int count=valstr.length();
	    while (n>0){
	        int a = n%10;
	        sum +=Math.pow(a,count);
	        n=n/10;
	        count--;
	    }
	  
	        System.out.println(sum);
	}
}
