package edu.smith.cs.csc212.p4;

public class SecretExit extends Exit {
	private boolean hidden = true;
	public SecretExit(String target, String description) {
		super(target, description);
	}
	
	public boolean getHidden() {
		return hidden;
	}
	
	public void reveal() {
		hidden = false;
	}
}
