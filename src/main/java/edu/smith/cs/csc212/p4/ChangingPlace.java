package edu.smith.cs.csc212.p4;

public class ChangingPlace extends Place {
	/*
	 * The description of the place that will be printed at night
	 */
	private String nightDescription;
	/*
	 * Uses the super constructor of Place and initializes nightDescription to create a ChangingPlace object
	 */
	private ChangingPlace(String id, String description, String nightDescription, boolean terminal){
		super(id, description, terminal);
		this.nightDescription = nightDescription;
	}
	/**
	 * Create a place with an id and description.
	 * @param id - this is the id of the place (for creating {@link Exit} objects that go here).
	 * @param description - this is what we show to the user during the day.
	 * @param nightDescription - this is what we show to the user at night.
	 * @return the new Place object (add exits to it).
	 */
	public static ChangingPlace create(String id, String description, String nightDescription) {
		return new ChangingPlace(id, description, nightDescription, false);

	}
	/**
	 * The narrative description of this place.
	 * @return what we show to a player about this place depending on the time in the game.
	 */
	public String getDescription(GameTime time) {
		if(time.isNightTime()) {
			return nightDescription;
		}
		else {
			return description;
		}
	}
	
}
