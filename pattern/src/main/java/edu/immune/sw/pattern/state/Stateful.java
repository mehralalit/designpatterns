package edu.immune.sw.pattern.state;

public interface Stateful {
	
	public void setState(State state);
	
	public State getState();
	
}
