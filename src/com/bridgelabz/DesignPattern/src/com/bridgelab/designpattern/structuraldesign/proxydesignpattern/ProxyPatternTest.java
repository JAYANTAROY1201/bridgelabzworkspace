package com.bridgelab.designpattern.structuraldesign.proxydesignpattern;

public class ProxyPatternTest {
	public static void main(String[] args) {
		CommandExecutor executor = new CommandExecutorProxy("Pankaj", "wrong_pwd");
		try {
			executor.runCommand("mkdir");
			executor.runCommand("lsl -ltr");
			executor.runCommand(" rm -rf abc.pdf");
		} catch (Exception e) {
			System.out.println("Exception Message::" + e.getMessage());
		}
	}
}
