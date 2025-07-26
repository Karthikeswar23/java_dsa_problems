public class Main
{
    public static int len(int n){
        int num = n;
        int count = 0;
        while(num > 0){
            num = num/10;
            count++;
        }
        return count;
    }
    public static boolean disarium(int n){
        int num = n;
        int l = len(n);
        int sum = 0;
        while(n > 0){
            int a = n % 10;
            sum += Math.pow(a,l--);
            n = n / 10;
        }
        if(num == sum)  return true;
        else    return false;
    }
	public static void main(String[] args) {
	    int i =1;
	    int n = 1000;
	    for(;i <= n; i++){
	        if(disarium(i)){
	            System.out.println(i);
	        }
	    }
	}
}
