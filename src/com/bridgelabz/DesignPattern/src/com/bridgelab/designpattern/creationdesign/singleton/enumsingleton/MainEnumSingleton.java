package com.bridgelab.designpattern.creationdesign.singleton.enumsingleton;

public class MainEnumSingleton {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		EnumSingleton.INSTANCE.printMessege();
	}
}
