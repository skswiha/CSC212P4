package edu.smith.cs.csc212.p4;

public class ChangingPlace extends Place {
	
	private String nightDescription;
	
	private ChangingPlace(String id, String description, String nightDescription, boolean terminal){
		super(id, description, terminal);
		this.nightDescription = nightDescription;
	}
	public static ChangingPlace create(String id, String description, String nightDescription) {
		return new ChangingPlace(id, description, nightDescription, false);

	}
	public String getDescription(GameTime time) {
		if(time.isNightTime()) {
			return nightDescription;
		}
		else {
			return description;
		}
	}
	
}
