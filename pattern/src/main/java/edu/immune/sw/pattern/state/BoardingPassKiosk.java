package edu.immune.sw.pattern.state;

import java.util.HashMap;
import java.util.Map;

public class BoardingPassKiosk implements Stateful {

	private Map<Integer, String> airlines;

	private State available;
	private State waiting;
	private State verified;
	private State invalid;
	private State review;
	private State confirm;

	private State state;
	private int airline;
	private String pnr;

	private void setAirlines() {
		airlines = new HashMap<>();
		airlines.put(1, "Air India");
		airlines.put(2, "Emirates");
		airlines.put(3, "Singapore Airlines");
		airlines.put(4, "Lufthansa");
		airlines.put(5, "Air Canada");
	}

	public BoardingPassKiosk() {

		setAirlines();

		this.available = new Available(this);
		this.waiting = new Waiting(this);
		this.verified = new Verified(this);
		this.invalid = new Invalid(this);
		this.review = new Review(this);
		this.confirm = new Confirm(this);

		this.state = available;

		this.airline = 0;
	}

	public Map<Integer, String> getAirlines() {
		return this.airlines;
	}

	public State getAvailable() {
		return available;
	}

	public State getWaiting() {
		return waiting;
	}

	public State getVerified() {
		return verified;
	}

	public State getInvalid() {
		return invalid;
	}

	public State getReview() {
		return review;
	}

	public State getConfirm() {
		return confirm;
	}

	public int getAirline() {
		return airline;
	}

	public String getPnr() {
		return pnr;
	}

	public void setAirline(int airline) {
		this.airline = airline;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

	@Override
	public State getState() {
		return state;
	}
	
	@Override
	public void setNextState(State state) {
		this.state = state;
	}

	@Override
	public void setPreviousState(State state) {
		this.state = state;
	}
	
	public void selectAirline() {
		this.state.selectAirline();
	}

	public void inputPNR() {
		this.state.inputPNR();
	}

	public void pickSeats() {
		this.state.pickSeats();
	}

	public void reviewSelection() {
		this.state.reviewSelection();
	}

	public void printBoardingPass() {
		this.state.printBoardingPass();
	}

}
