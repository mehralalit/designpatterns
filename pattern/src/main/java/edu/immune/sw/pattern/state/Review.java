package edu.immune.sw.pattern.state;

import java.util.Scanner;

public class Review implements State {

	private String CONFIRM_INPUT = "x";
	private BoardingPassKiosk kiosk;

	public Review(BoardingPassKiosk kiosk) {
		this.kiosk = kiosk;
	}

	@Override
	public void reviewSelection(Scanner scanner) {

		System.out.println(" -- Review Your Selection -- ");
		System.out.printf(" Airline: %s\n", kiosk.getAirline());
		System.out.printf(" PNR: %s\n", kiosk.getPnr());
		System.out.printf(" Seat: %s\n", kiosk.getSeat());

		System.out.printf(" Press 'x' to Confirm: ");
		String input = scanner.next();

		if (CONFIRM_INPUT.equals(input)) {
			kiosk.setState(kiosk.getConfirm());
		} else {
			kiosk.setState(kiosk.getAvailable());
		}

	}

}
