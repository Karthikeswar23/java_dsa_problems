// import java.util.*;
// public class Main
// {
// 	public static void main(String[] args) {
// 	    Scanner sc = new Scanner(System.in);
// 	    String str = sc.nextLine();
// 	    int l=0,r=0;
// 	    for(int i=0,j=str.length()/2;i<str.length()/2 || j<str.length();i++,j++){
// 	        if("aeiouAEIOU".indexOf(str.charAt(i))!=-1){
// 	            l+=1;
// 	        }
// 	        if("aeiouAEIOU".indexOf(str.charAt(j))!=-1){
// 	            r+=1;
// 	        }
// 	    }
// 	    System.out.print(l+" "+r);
// 	}
// }
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    int l=0,r=0;
	    for(int i=0;i<str.length()/2;i++){
	        if("aeiouAEIOU".indexOf(str.charAt(i))!=-1){
	            l+=1;
	        }
	    }
	    for(int j=str.length()/2;j<str.length();j++){
	        if("aeiouAEIOU".indexOf(str.charAt(j))!=-1){
	            r+=1;
	        }
	    }
	    System.out.print(Math.abs(l-r));
	}
}
