package edu.immune.sw.pattern.state;

/**
 * Final state that assist with result display  
 * 
 * @author Lalit Mehra
 * @since Dec 10, 2019
 *
 */
public class Confirm implements State {

	private BoardingPassKiosk kiosk;

	public Confirm(BoardingPassKiosk kiosk) {
		this.kiosk = kiosk;
	}

	/**
	 * Displays the boarding pass to the user 
	 */
	@Override
	public void printBoardingPass() {
		System.out.println(" Boarding Pass Details ");
		System.out.printf(" Airline: %s\n", kiosk.getAirline());
		System.out.printf(" PNR: %s\n", kiosk.getPnr());
		System.out.printf(" Seat: %s\n", kiosk.getSeat());
	}

}
