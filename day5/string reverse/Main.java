import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String b ="";
        for(int i =0;i<A.length();i++){
            b+=A.charAt((A.length())-i-1);
        }
        System.out.print((A.equals(b)) ? "Yes" :"No" );
    }
}