package edu.immune.sw.pattern.state;

public class Review implements State {

	private BoardingPassKiosk kiosk;

	public Review(BoardingPassKiosk kiosk) {
		this.kiosk = kiosk;
	}
	
	@Override
	public void selectAirline() {
		// TODO Auto-generated method stub

	}

	@Override
	public void inputPNR() {
		// TODO Auto-generated method stub

	}

	@Override
	public void pickSeats() {
		// TODO Auto-generated method stub

	}

	@Override
	public void reviewSelection() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printBoardingPass() {
		// TODO Auto-generated method stub

	}

}
