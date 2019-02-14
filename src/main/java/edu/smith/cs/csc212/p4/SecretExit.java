package edu.smith.cs.csc212.p4;

public class SecretExit extends Exit {
	private boolean hidden;
	public SecretExit(String target, String description) {
		super(target, description);
		hidden = true;
	}
	
	public boolean getHidden() {
		return hidden;
	}
	
	public void reveal() {
		hidden = false;
	}
}
