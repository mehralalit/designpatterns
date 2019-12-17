package edu.immune.sw.pattern.state;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BoardingPassKiosk implements Stateful {

	private Map<Integer, String> airlines;

	private State available;
	private State waiting;
	private State verified;
	private State review;
	private State confirm;

	private State state;
	private int airline;
	private String pnr;
	private String seat;

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

	public String getSeat() {
		return seat;
	}
	
	public void setAirline(int airline) {
		this.airline = airline;
	}

	public void setPnr(String pnr) {
		this.pnr = pnr;
	}
	
	public void setSeat(String seat) {
		this.seat = seat;
	}

	@Override
	public State getState() {
		return state;
	}
	
	@Override
	public void setState(State state) {
		this.state = state;
	}

	public void selectAirline(Scanner scanner) {
		this.state.selectAirline(scanner);
	}

	public void inputPNR(Scanner scanner) {
		this.state.inputPNR(scanner);
	}

	public void pickSeats(Scanner scanner) {
		this.state.pickSeats(scanner);
	}

	public void reviewSelection(Scanner scanner) {
		this.state.reviewSelection(scanner);
	}

	public void printBoardingPass() {
		this.state.printBoardingPass();
	}

}
