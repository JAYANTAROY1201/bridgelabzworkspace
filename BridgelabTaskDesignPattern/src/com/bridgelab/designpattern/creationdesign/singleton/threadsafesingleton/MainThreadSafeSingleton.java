package com.bridgelab.designpattern.creationdesign.singleton.threadsafesingleton;

public class MainThreadSafeSingleton {
	public static void main(String[] args) {
		ThreadSafeSingleton ts1 = ThreadSafeSingleton.getInstance();
		ThreadSafeSingleton ts2 = ThreadSafeSingleton.getInstance();
		ts1.str = ts1.str.toLowerCase();

		System.out.println(ts1.str);
		System.out.println(ts2.str);
	}
}
