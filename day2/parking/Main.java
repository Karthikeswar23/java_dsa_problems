import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hours = sc.nextInt();
		int amt =50;
		if (hours > 0) {
			if(hours<=2) {
				System.out.print("Total charge is "+amt+" rupees");
			}
			else {
				if(hours>2) {
					System.out.println("Total charge is "+(amt+(hours-2)*20)+" rupees");
				}
			}
		}
	}
}

