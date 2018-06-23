package com.bridgelab.designpattern.creationdesign.singleton.lazyinitialization;

/**
 * Purpose: To design a singleton class by eager initiatization process
 * @author Jayanta Roy
 * @version 1.0
 * @since 12/06/18
 */
public class LazyInitializationSingleton {
	private static LazyInitializationSingleton inst = null;
	public String str;

	private LazyInitializationSingleton() {
		str = "This is the example of lazy initialized singleton";
	}

	public static LazyInitializationSingleton getObject() {
		if (inst == null) {
			inst = new LazyInitializationSingleton();
		}
		return inst;
	}
}
