package edu.smith.cs.csc212.p4;

public class GameTime {
	/*
	 * The hour of the current time
	 * */
	public int hour;
	/*
	 * The number of hours the player has spent in the game
	 * */
	public int hoursSpent;
	/**
	 * Initializes the time in the game to 0:00
	 * */
	public GameTime() {
		hour = 0;
		hoursSpent = 0;
	}
	/**
	 * @return the value of int hour
	 * */
	public int getHour() {
		return hour;
	}
	
	/**
	 * Increases the hour as long as it is less than 23:00, and sets it back to 0:00 after 23:00
	 * */
	public void increaseHour() {
		if (hour < 23) {
			hour++;
		}
		else {
			hour = 0;
			}
		}
	/**
	 * @return true if the hour is between 21:00 and 7:00, otherwise @return false
	 * */
	public boolean isNightTime() {
		if (hour > 21 || hour < 7) {
			return true;
		}
		else {
			return false;
		}
	}
}
