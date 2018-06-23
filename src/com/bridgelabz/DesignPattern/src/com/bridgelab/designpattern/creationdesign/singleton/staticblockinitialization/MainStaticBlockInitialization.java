package com.bridgelab.designpattern.creationdesign.singleton.staticblockinitialization;

public class MainStaticBlockInitialization {

	public static void main(String[] args) {
		StaticBlockInitialization st1 =StaticBlockInitialization.getInstance();
		StaticBlockInitialization st2 =StaticBlockInitialization.getInstance();
		st1.str=st2.str.toLowerCase();
		
		System.out.println(st1.str);
		System.out.println(st2.str);

	}

}
