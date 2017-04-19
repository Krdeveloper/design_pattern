package test;

import java.util.Calendar;

public class FakeTimeProvider implements TimeProvider {
	private Calendar cal;
	public FakeTimeProvider() {
		// TODO Auto-generated constructor stub
		cal = Calendar.getInstance();
	}
	public FakeTimeProvider(int hours){
		cal = Calendar.getInstance();
		setHours(hours);
	}
	@Override
	public void setHours(int hours) {
		// TODO Auto-generated method stub
		cal.set(Calendar.HOUR_OF_DAY, hours);

	}

	@Override
	public int getTime() {
		// TODO Auto-generated method stub
		return cal.get(Calendar.HOUR_OF_DAY);
	}

}
