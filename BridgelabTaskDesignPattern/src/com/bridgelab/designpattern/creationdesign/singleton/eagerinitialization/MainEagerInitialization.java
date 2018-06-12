package com.bridgelab.designpattern.creationdesign.singleton.eagerinitialization;

public class MainEagerInitialization {

	public static void main(String[] args) {
		
		EagerInitialization ei1 =EagerInitialization.getInstance();
		EagerInitialization ei2 =EagerInitialization.getInstance();
			ei1.str=ei1.str.toLowerCase();
			
			System.out.println(ei1.str);
			System.out.println(ei2.str);

		}
	}

