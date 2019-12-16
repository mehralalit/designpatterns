package edu.immune.sw.pattern.state;

import java.util.Map;
import java.util.Scanner;

public class Available implements State {
	
	private BoardingPassKiosk kiosk;

	public Available(BoardingPassKiosk kiosk) {
		this.kiosk = kiosk;
	}

	@Override
	public void selectAirline() {
		
		Map<Integer, String> airlines = this.kiosk.getAirlines();
		
		try(Scanner scanner = new Scanner(System.in)) {
			System.out.println("Select the Airlines");
			airlines.forEach((key, value) -> {
				System.out.printf("%d -> %s\n", key, value);
			});
			System.out.print(": ");
			
			int airline = scanner.nextInt();
			kiosk.setAirline(airline);
			kiosk.setNextState(kiosk.getWaiting());
		}
	}

}
