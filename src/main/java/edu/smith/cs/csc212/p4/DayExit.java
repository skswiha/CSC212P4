package edu.smith.cs.csc212.p4;

public class DayExit extends SecretExit {
	/**
	 * Create a new DayExit using the super constructor SuperExit.
	 * @param target - where it goes.
	 * @param description - how it looks.
	 * @param hidden - whether or not it's visible to the user (initialized in super constructor)
	 */
	public DayExit(String target, String description) {
		super(target, description);
	}
	/**
	 * Set the value of hidden to true if it's night, and false if it's day
	 */
	public void checkTime(GameTime time) {
		if(!time.isNightTime()) {
			this.hidden = false;
		}
		else {
			this.hidden = true;
		}
	}
}
