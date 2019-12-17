package edu.immune.sw.pattern.state;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.IntStream;

public class Verified implements State {

	private BoardingPassKiosk kiosk;

	public Verified(BoardingPassKiosk kiosk) {
		this.kiosk = kiosk;
	}

	private boolean[][] fetchSeatMatrix() {
		boolean[][] seatMatrix = new boolean[10][5];

		/* fill seat matrix with random values */
		for (int row = 0; row < 10; row++) {
			for (int col = 0; col < 5; col++) {
				seatMatrix[row][col] = ThreadLocalRandom.current().nextBoolean();
			}
		}

		return seatMatrix;
	}

	private void printHorizontalBorder() {
		IntStream.rangeClosed(1, 11).forEach((x) -> System.out.print("-"));
		System.out.println();
	}

	private void displaySeatMatrix() {
		boolean seatMatrix[][] = fetchSeatMatrix();
		for (int row = 0; row < 10; row++) {
			printHorizontalBorder();
			for (int col = 0; col < 5; col++) {
				boolean x = seatMatrix[row][col];
				System.out.printf("|%s", !x ? "x" : " ");
			}
			System.out.println("|");
		}
		printHorizontalBorder();
	}

	@Override
	public void pickSeats(Scanner scanner) {

		System.out.println("\n Seat Matrix ");
		displaySeatMatrix();

		System.out.print("Enter Seat: ");
		String seat = scanner.next();
		kiosk.setSeat(seat);

		kiosk.setState(kiosk.getReview());

	}

}
