// Find the Most Frequent Character
// Problem Statement:Find the character that appears most frequently in a string.
// Example:
// Input: "mississippi"
// Output: "i" (Frequency: 4)
import java.util.*;
public class Main{
    public static void main(String[] Args){
        Scanner sc =new Scanner(System.in);
        String str = sc.next();
        int[] cnt = new int[256];
        for(char ch : str.toCharArray()){
            cnt[ch]++;
        }
        int max=0;
        char rc=' ';
        for(char ch : str.toCharArray()){
            if(cnt[ch]>max){
                max=cnt[ch];
                rc=ch;
            }
        }
        System.out.print(rc+" "+max);
    }
}