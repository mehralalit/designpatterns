package edu.immune.sw.pattern.state;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Waiting implements State {
	
	private BoardingPassKiosk kiosk;
	
	public Waiting(BoardingPassKiosk kiosk) {
		this.kiosk = kiosk;
	}
	
	private static boolean validate(String pnr) {
		return Pattern.matches("[a-zA-Z0-9]{6}", pnr);
	}

	@Override
	public void inputPNR() {
		
		try(Scanner scanner = new Scanner(System.in)) {
			
			System.out.printf("Airline: %s | Enter PNR: ", kiosk.getAirline());
			String pnr = scanner.next();
			
			if(validate(pnr)) {
				kiosk.setNextState(kiosk.getVerified());
			} else {
				kiosk.setNextState(kiosk.getInvalid());
			}
		}
	}

}
