package edu.immune.sw.pattern.proxy;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * Actual Implementation to fetch weather information
 * 
 * @author Lalit Mehra
 * @since Dec 25, 2020
 *
 */
public class WeatherInfo implements Proxy {
	
	private static Random random;

	static {
		random = new Random();
	}
	
	/**
	 * Returns temperature for every hour for a city. <br>
	 * The method signature does not take into consideration the city name and
	 * returns same value for every input
	 */
	public Map<Integer, Integer> fetchTemperature(String city) {

		Map<Integer, Integer> temperatures = new HashMap<Integer, Integer>(24);

		/* fill temperature in the map randomly within the range of 1 and 20 */
		IntStream.rangeClosed(0, 23).forEach((x) -> temperatures.put(x, random.nextInt(20)));
		return temperatures;
	}

}
