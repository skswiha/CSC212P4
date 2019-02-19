package edu.smith.cs.csc212.p4;

public class SecretExit extends Exit {
	/* 
	 * A boolean value representing whether or not the exit is hidden
	 * */
	protected boolean hidden;
	
	/**
	 * Create a new SecretExit using the super constructor Exit.
	 * @param target - where it goes.
	 * @param description - how it looks.
	 * @param hidden - whether or not it's visible to the user
	 */
	public SecretExit(String target, String description) {
		super(target, description);
		hidden = true;
	}
	
	/**
	 *@return the value of the private variable hidden, so other classes can access it 
	 **/
	public boolean getHidden() {
		return hidden;
	}
	
	/*
	 * Reveals the exit by setting its hidden value to false
	 * */
	public void reveal() {
		hidden = false;
	}
}
