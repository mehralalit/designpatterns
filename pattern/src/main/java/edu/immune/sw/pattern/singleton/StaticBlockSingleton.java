package edu.immune.sw.pattern.singleton;

public class StaticBlockSingleton {

	private static StaticBlockSingleton instance;
	
	private StaticBlockSingleton() {
		throw new RuntimeException();
	}
	
	static {
		try {
			instance = new StaticBlockSingleton();
		} catch(Exception e) {
			instance = null;
		}
	}
	
	public static StaticBlockSingleton getInstance() {
		return instance;
	}
	
}
