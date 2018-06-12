package com.bridgelab.designpattern.creationdesign.singleton.lazyinitialization;

public class MainLazyInitialization {

	public static void main(String[] args) {
		LazyInitializationSingleton es1 =LazyInitializationSingleton.getObject();
		LazyInitializationSingleton es2 =LazyInitializationSingleton.getObject();
		es1.str=es1.str.toUpperCase();
		
		System.out.println(es1.str);
		System.out.println(es2.str);
		
	}

}
