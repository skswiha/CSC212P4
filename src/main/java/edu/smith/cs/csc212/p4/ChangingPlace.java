package edu.smith.cs.csc212.p4;

import java.util.ArrayList;
import java.util.List;

public class ChangingPlace extends Place {
	/**
	 * This is a list of places we can get to from this place.
	 */
	private List<Exit> exits;
	/**
	 * This is the identifier of the place.
	 */
	private String id;
	/**
	 * What to tell the user about this place.
	 */
	private String description;

	private String nightDescription;
	/**
	 * Whether reaching this place ends the game.
	 */
	private boolean terminal;
	
	/**
	 * Internal only constructor for Place. Use {@link #create(String, String)} or {@link #terminal(String, String)} instead.
	 * @param id - the internal id of this place.
	 * @param description - the user-facing description of the place.
	 * @param terminal - whether this place ends the game.
	 */
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
