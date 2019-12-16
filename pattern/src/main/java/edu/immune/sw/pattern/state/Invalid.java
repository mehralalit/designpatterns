package edu.immune.sw.pattern.state;

public class Invalid implements State {

	private BoardingPassKiosk kiosk;

	public Invalid(BoardingPassKiosk kiosk) {
		this.kiosk = kiosk;
	}
	
	@Override
	public void pickSeats() {
		// TODO Auto-generated method stub
		
	}

}
