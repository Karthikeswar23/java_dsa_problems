import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int size = sc.nextInt();
	    int[] a = new int[size];
			for(int i=0;i<size;i++){
				a[i]=sc.nextInt();
			}
			int max=a[0];
				for(int j=1;j<(size)/2;j++){
				if(a[j]>max){
					    max=a[j];
					}
				}
			int min=a[size/2];
				for(int j=size/2+1;j<(size);j++){
					if(a[j]<min){
						min=a[j];
					}
				}
					System.out.print(max-min);
    }
}