public class Main
{
	public static void main(String[] args) {
		int days=775;
		int year=days/365;
		int month=(days-(year*365))/30;
		int week=((days-(year*365))-month*30)/7;
		int day=((days-(year*365))-month*30)-week*7;
		System.out.print(year+" "+month+" "+week+" "+day);
}
}
