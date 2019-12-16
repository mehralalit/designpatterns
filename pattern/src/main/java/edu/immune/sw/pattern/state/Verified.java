package edu.immune.sw.pattern.state;

public class Verified implements State {

	private BoardingPassKiosk kiosk;

	public Verified(BoardingPassKiosk kiosk) {
		this.kiosk = kiosk;
	}

	@Override
	public void pickSeats() {
		
	}

}
