package edu.smith.cs.csc212.p4;

public class NightExit extends SecretExit {
	/**
	 * Create a new NightExit using the super constructor SecretExit.
	 * @param target - where it goes.
	 * @param description - how it looks.
	 * @param hidden - whether or not it's visible to the user (initialized in super constructor)
	 */
	public NightExit(String target, String description) {
		super(target, description);
	}
	/**
	 * Set the value of hidden to false if it's night, and true if it's day
	 */
	public void checkTime(GameTime time) {
		if(time.isNightTime()) {
			this.hidden = false;
		}
		else {
			this.hidden = true;
		}
	}
}
