public class Main
{
	public static void main(String[] args) {
	    Arith ob = new Arith();
	    ob.add(12,13);
	    ob.add(15);
	    ob.add(ob.add(15),13);
	}
}
class Arith{
    void add(int num1,int num2){
        System.out.println(num1+num2);
    }
    int add(int num){
        return num+2;
    }
}
