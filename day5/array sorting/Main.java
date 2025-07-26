import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int size = sc.nextInt();
	    int[] a = new int[size];
	    int max=1;
			for(int i=0;i<size;i++){
				a[i]=sc.nextInt();
			}
      for(int i =0;i<size-1;i++){
				for(int j=0;j<size-i-1;j++){
					if(a[j]>a[j+1]){
						int temp = a[j];
						a[j]=a[j+1];
						a[j+1]=temp;
					}
				}
				}
					System.out.print(Arrays.toString(a));
    }
}