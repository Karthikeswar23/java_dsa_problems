import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str =sc.next();
	    char[] ch = str.toCharArray();
	    int cnt=0;
	    for(int i=0;i<str.length()-1;i++){
	        if(ch[i]=='a' || ch[i]=='e' || ch[i]=='i' || ch[i]=='o' || ch[i]=='u'){
	            cnt+=1;
	            System.out.print(ch[i]);
	        }
	    }
	    System.out.println();
	    System.out.print(str.length()-cnt);
	}
}
