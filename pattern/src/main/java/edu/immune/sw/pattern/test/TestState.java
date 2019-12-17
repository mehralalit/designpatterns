package edu.immune.sw.pattern.test;

import java.util.Scanner;

import edu.immune.sw.pattern.state.BoardingPassKiosk;

/**
 * Functional Test
 * 
 * @author Lalit Mehra
 * @since Dec 10, 2019
 *
 */
public class TestState {

	public static void main(String[] args) {

		BoardingPassKiosk kiosk = new BoardingPassKiosk();

		try (Scanner scanner = new Scanner(System.in)) {

			kiosk.selectAirline(scanner);

			kiosk.inputPNR(scanner);

			kiosk.pickSeats(scanner);

			kiosk.reviewSelection(scanner);

			kiosk.printBoardingPass();

		}

	}

}
