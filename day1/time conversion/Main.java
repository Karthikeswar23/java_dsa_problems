public class Main
{
	public static void main(String[] args) {
		int tsec=3665;
		int hour=tsec/3600;
		int min=(tsec-hour*3600)/60;
		int sec=(tsec-hour*3600)-min*60;
		System.out.println("hours:"+hour+" Minutes:"+min+" Seconds:"+sec);
}
}