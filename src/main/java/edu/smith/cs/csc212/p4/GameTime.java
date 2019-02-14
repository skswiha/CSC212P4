package edu.smith.cs.csc212.p4;

public class GameTime {
	public int hour;
	public int hoursSpent;
	public GameTime() {
		hour = 0;
		hoursSpent = 0;
	}
	
	public int getHour() {
		return hour;
	}
	
	public void increaseHour() {
		if (hour < 23) {
			hour++;
		}
		else {
			hour = 0;
			}
		}
	public boolean isNightTime() {
		if (hour > 21 || hour < 7) {
			return true;
		}
		else {
			return false;
		}
	}
}
