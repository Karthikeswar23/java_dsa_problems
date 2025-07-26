import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    for(int i=0;i<str.length();i++){
	        int cnt=0;
	        for(int j=0;j<str.length();j++){
	            if(str.charAt(i)==str.charAt(j)){
	                cnt+=1;
	                str.charAt(j)=;
	            }
	        }
	        System.out.println(str.charAt(i)+":"+cnt);
	    }
	}
}
