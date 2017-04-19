package test;

import java.util.Calendar;

public class TimeReminder {
	TimeProvider tProv;
	MP3 m = new MP3();
	
	public void setTimeProvider(TimeProvider tProv){
		this.tProv = tProv;
	}
	public void reminder(){
		/*Calendar cal = Calendar.getInstance();
		m = new MP3();*/
		int hour = tProv.getTime();
		if(hour>=22){
			m.playSong();
		}
	}
}
