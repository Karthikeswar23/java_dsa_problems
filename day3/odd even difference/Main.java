import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    int n = 123456;
	    int even=0,odd=0,rev=0,d=0;
	    while(n > 0){
	        int a = n%10;
	        rev = rev*10+a;
	        n=n/10;
	    }
	    while(rev>0){
	        d=rev%10;
	        if (d%2==0){
	            even = even*10+d;
	        }
	        else{
	            odd=odd*10+d;
	        }
	    }
		System.out.println(even-odd);
	}
}