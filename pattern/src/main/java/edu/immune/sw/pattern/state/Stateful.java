package edu.immune.sw.pattern.state;

public interface Stateful {
	
	public void setNextState(State state);
	
	public void setPreviousState(State state);
	
	public State getState();
	
}
