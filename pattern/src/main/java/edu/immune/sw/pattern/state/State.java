package edu.immune.sw.pattern.state;

public interface State {
	
	public default void selectAirline() {
		System.out.printf("Invalid Operation");
	}
	
	public default void inputPNR() {
		System.out.printf("Invalid Operation");
	}
	
	public default void pickSeats() {
		System.out.printf("Invalid Operation");
	}
	
	public default void reviewSelection() {
		System.out.printf("Invalid Operation");
	}
	
	public default void printBoardingPass() {
		System.out.printf("Invalid Operation");
	}
	
}
