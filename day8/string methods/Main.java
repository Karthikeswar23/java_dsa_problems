/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    String str1 ="javaLife";
	    String str2 = "program     ";
	    System.out.println("Original string"+str1+""+str2);
	    System.out.println("Length:"+""+str1.length());
	    System.out.println("charAt(3) :"+""+str1.charAt(3));
	    System.out.println("subString(3):"+""+str1.substring(3));
	    System.out.println("subString(2,7) :"+""+str1.substring(2,7));
	    System.out.println("toLowerCase():"+""+str1.toLowerCase());
	    System.out.println("toUpperCase():"+""+str1.toUpperCase());
	    System.out.println("trim:"+""+str2.trim());
	    System.out.println("equals():"+""+str1.equals(str2));
	    System.out.println("equalsIgnoreCase():"+""+str1.equalsIgnoreCase(str2));
	    System.out.println("compareTo():"+""+str1.compareTo(str2));
	    System.out.println("contains(\"while\")"+""+str2.contains("gram"));
	    System.out.println("replace('a','Q')"+""+str2.replace('a','Q'));
	    String alt =sc.nextLine();
	    String[] parts = alt.split(" ");
	    System.out.println("First: " + parts[0] + " Sencond: " + parts[1]);
	    
	    System.out.println("index of: " + str2.indexOf("z"));
	    System.out.println("last index of: " + str2.lastIndexOf("a"));
	    System.out.println("Starts with: " + str2.startsWith("All"));
	    System.out.println("Ends with: " + str2.endsWith("ari"));
	    System.out.println(str1==str2);
	    System.out.println();
	    
	}
}