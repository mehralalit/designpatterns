package edu.immune.sw.pattern.test;

import java.util.Map;
import java.util.stream.IntStream;

import edu.immune.sw.pattern.proxy.Proxy;
import edu.immune.sw.pattern.proxy.WeatherInfo;
import edu.immune.sw.pattern.proxy.WeatherInfoProxy;

/**
 * Functional Test to verify the functionality of Proxy Design Pattern
 * 
 * @author Lalit Mehra
 * @since Dec 25, 2019
 * @see Proxy
 * @see WeatherInfo
 * @see WeatherInfoProxy
 */
public class TestProxy {
	
	public static void main(String[] args) {
		
		WeatherInfoProxy weatherInfo = new WeatherInfoProxy();
		Map<Integer, Integer> temperature = weatherInfo.fetchTemperature("delhi");
		System.out.printf("::: Temperature of Delhi ::: \n %s \n", temperature.toString());
		
		IntStream.rangeClosed(0, Integer.MAX_VALUE).forEach((x) -> {});
		temperature = weatherInfo.fetchTemperature("delhi");
		System.out.printf("::: Temperature of Delhi ::: \n %s \n", temperature.toString());
	}

}
