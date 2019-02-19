package edu.smith.cs.csc212.p4;

public class DayExit extends SecretExit {
	public DayExit(String target, String description) {
		super(target, description);
	}
	
	public void checkTime(GameTime time) {
		if(!time.isNightTime()) {
			this.hidden = false;
		}
		else {
			this.hidden = true;
		}
	}
}
