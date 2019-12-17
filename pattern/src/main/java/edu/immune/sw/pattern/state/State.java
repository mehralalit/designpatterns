package edu.immune.sw.pattern.state;

import java.util.Scanner;

public interface State {
	
	public default void selectAirline(Scanner scanner) {
		System.out.printf("Invalid Operation");
	}
	
	public default void inputPNR(Scanner scanner) {
		System.out.printf("Invalid Operation");
	}
	
	public default void pickSeats(Scanner scanner) {
		System.out.printf("Invalid Operation");
	}
	
	public default void reviewSelection(Scanner scanner) {
		System.out.printf("Invalid Operation");
	}
	
	public default void printBoardingPass() {
		System.out.printf("Invalid Operation");
	}
	
}
