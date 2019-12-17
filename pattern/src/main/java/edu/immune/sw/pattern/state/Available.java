package edu.immune.sw.pattern.state;

import java.util.Map;
import java.util.Scanner;

public class Available implements State {

	private BoardingPassKiosk kiosk;

	public Available(BoardingPassKiosk kiosk) {
		this.kiosk = kiosk;
	}

	@Override
	public void selectAirline(Scanner scanner) {

		Map<Integer, String> airlines = this.kiosk.getAirlines();

		System.out.println("Select the Airlines");
		airlines.forEach((key, value) -> {
			System.out.printf("%d -> %s\n", key, value);
		});
		System.out.print(": ");

		int airline = scanner.nextInt(); scanner.nextLine();
		kiosk.setAirline(airline);
		kiosk.setState(kiosk.getWaiting());

	}

}
