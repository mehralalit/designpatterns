package edu.immune.sw.pattern.state;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Waiting implements State {

	private BoardingPassKiosk kiosk;

	public Waiting(BoardingPassKiosk kiosk) {
		this.kiosk = kiosk;
	}

	private static boolean validate(String pnr) {
		/* validation criteria: alphanumeric with length 6 */
		return Pattern.matches("[a-zA-Z0-9]{6}", pnr);
	}

	@Override
	public void inputPNR(Scanner scanner) {

		System.out.printf("Airline: %s | Enter PNR: ", kiosk.getAirlines().get(kiosk.getAirline()));
		String pnr = scanner.nextLine();

		kiosk.setPnr(pnr);

		/* validate PNR */
		if (validate(pnr)) {
			System.out.println(" -- PNR Verified -- ");
			kiosk.setState(kiosk.getVerified());
		} else {
			System.out.println(" -- PNR Invalid -- ");
			kiosk.setState(kiosk.getAvailable());
		}

	}

}
