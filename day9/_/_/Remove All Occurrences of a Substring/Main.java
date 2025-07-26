// Remove All Occurrences of a Substring
// Problem Statement:Remove every occurrence 
//of a given substring from a string.
// Example:
// Input: "abcabcabc", remove "ab"
// Output:"ccc"
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String[] str =sc.nextLine().split(", remove ");
		int Mlen=str[0].length();
		System.out.println(str[0]+"-"+str[1]);
		for(int i=0;i<Mlen;i++){
		    if(str[0].contains(str[1])){
		        str[0]=str[0].replace("ab","");
		    }
		}
		System.out.println(str[0]);
	}
}

