package edu.immune.sw.pattern.singleton;

import java.io.Serializable;

/**
 * A Serialized Singleton Class
 * 
 * @author Lalit Mehra
 *
 */
public class SerializedSingleton implements Serializable {

	private static final long serialVersionUID = -7889143059742888814L;
	
	private static SerializedSingleton instance = new SerializedSingleton();
	
	private SerializedSingleton() {}
	
	protected Object readResolve() {
		return get();
	}
	
	public static SerializedSingleton get() {
		return instance;
	}

}
