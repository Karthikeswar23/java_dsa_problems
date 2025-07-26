import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    int conso=0,vow=0;
	    for(int i=0;i<str.length();i++){
	        if("aeiouAEIOU".indexOf(str.charAt(i))!=-1){
	            str=str.replace(str.charAt(i),'@');
	        }
	    }
	    System.out.print(str);
	}
}
