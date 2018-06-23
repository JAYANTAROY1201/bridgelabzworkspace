package com.bridgelab.designpattern.structuraldesign.adapterdesignpattern;

public class Socket {
	public Volt getVolt(){
		return new Volt(120);
	}
}
