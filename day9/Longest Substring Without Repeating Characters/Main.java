// 1) Longest Substring Without Repeating Characters
// Problem Statement:Find the longest 
//substring without repeating characters.
// Example:
// Input: "abcabcbb"
// Output: "abc"
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String str =sc.next();
		String str1="";
		int n=str.length();
		for(int i=0; i<n; i++) {
			if(str1.indexOf(str.charAt(i))==-1) {
				str1+=str.charAt(i);
			}
		}
		System.out.println(str1);
	}
}
