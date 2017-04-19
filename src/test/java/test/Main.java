package test;

public class Main {
	public static void main(String[] args) {
		TimeProvider tProvSub = new FakeTimeProvider();
		tProvSub.setHours(23);
		
		TimeReminder tr = new TimeReminder();
		tr.setTimeProvider(tProvSub);
		
		tr.reminder();
	}
}
