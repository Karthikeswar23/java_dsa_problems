import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    int conso=0,vow=0;
	    for(int i=0;i<str.length();i++){
	        if("aeiouAEIOU".indexOf(str.charAt(i))==-1){
	            conso+=1;
	        }
	        else vow+=1;
	    }
	    System.out.print(conso+" "+vow);
	}
}
