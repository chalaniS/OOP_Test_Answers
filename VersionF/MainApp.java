package VersionF;

import java.util.ArrayList;

public class MainApp {

	public static void main(String[] args) throws MyException {
		AlarmClock ac1 = new AlarmClock();
		AlarmClock ac2 = new AlarmClock();		
		
		ac1.InputAlarm();
		ac2.InputAlarm();
		
		ArrayList<AlarmClock> arr = new ArrayList<AlarmClock>();
		
		arr.add(ac1);
		arr.add(ac2);
		
		for(AlarmClock i : arr) {
			i.ShowAlarm();
		}
		

	}

}
