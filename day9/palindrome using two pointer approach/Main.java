// import java.util.*;
// public class Main
// {
// 	public static void main(String[] args) {
// 	    Scanner sc = new Scanner(System.in);
// 	    String str = sc.nextLine();
// 	    char[] ch = str.toCharArray();
// 	    int len =str.length(),l=0,r=len-1;
// 	    for(int i=0,j=len-1;i<j;i++,j--){
// 	        char temp =ch[i];
// 	        ch[i]=ch[j];
// 	        ch[j]=temp;
// 	    }
// 	    String res = new String(ch);
// 	    System.out.print(res.equals(str));
// 	}
// }
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    char[] ch = str.toCharArray();
	    int len =str.length(),l=0,r=len-1,flag=0;
	    for(int i=0,j=len-1;i<j;i++,j--){
	        if(ch[i]==ch[j]){
	            flag = 1;
	        }
	        else {
	            flag =0;
	            break;
	        }
	    }
	    System.out.print(flag==1? "yes":"no");
	}
}
