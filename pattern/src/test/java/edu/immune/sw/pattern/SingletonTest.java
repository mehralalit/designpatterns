package edu.immune.sw.pattern;

import org.junit.Assert;
import org.junit.Test;

import edu.immune.sw.pattern.singleton.impl.EagerSingleton;
import edu.immune.sw.pattern.singleton.impl.LazySingleton;
import edu.immune.sw.pattern.singleton.impl.StaticBlockSingleton;

public class SingletonTest {

	@Test
	public void lazySingleton() {
		LazySingleton s = LazySingleton.getInstance();
		LazySingleton sl = LazySingleton.getInstance();

		Assert.assertEquals(s, sl);
	}
	
	@Test(expected = ExceptionInInitializerError.class)
	public void eagerSingletonException() {
		EagerSingleton singleton = EagerSingleton.getInstance();
	}
	
	public static void main(String[] args) {
		try {
			EagerSingleton singleton = EagerSingleton.getInstance();
		} catch(ExceptionInInitializerError e) {}
		System.out.println("hello world!");
	}
	
	@Test()
	public void staticBlockSingletonException() {
		StaticBlockSingleton singleton = StaticBlockSingleton.getInstance();
		Assert.assertNull(singleton);
	}
}
