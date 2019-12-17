package edu.immune.sw.pattern.state;

public class Confirm implements State {

	private BoardingPassKiosk kiosk;

	public Confirm(BoardingPassKiosk kiosk) {
		this.kiosk = kiosk;
	}

	@Override
	public void printBoardingPass() {
		System.out.println(" Boarding Pass Details ");
		System.out.printf(" Airline: %s\n", kiosk.getAirline());
		System.out.printf(" PNR: %s\n", kiosk.getPnr());
		System.out.printf(" Seat: %s\n", kiosk.getSeat());
	}

}
