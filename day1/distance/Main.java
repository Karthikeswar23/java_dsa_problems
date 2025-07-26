import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter point 1:");
		int x1=sc.nextInt();
		int y1=sc.nextInt();
		System.out.println("Enter point 2:");
		int x2=sc.nextInt();
		int y2=sc.nextInt();
		double dis =Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
		System.out.printf("%.3f",dis);
	}
}
