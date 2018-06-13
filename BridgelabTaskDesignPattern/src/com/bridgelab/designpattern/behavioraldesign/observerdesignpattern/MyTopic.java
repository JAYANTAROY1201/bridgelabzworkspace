package com.bridgelab.designpattern.behavioraldesign.observerdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class MyTopic implements Subject {
	private List<Observer> observerList;
	private String message;
	private boolean changed;
	private final Object MUTEX= new Object();
	
	public MyTopic(){
		this.observerList=new ArrayList<>();
	}
	@Override
	public void register(Observer observerObj) {
		if(observerObj == null) throw new NullPointerException("Null Observer");
		synchronized (MUTEX) {
		if(!observerList.contains(observerObj)) observerList.add(observerObj);
		}
	}

	@Override
	public void unregister(Observer obj) {
		synchronized (MUTEX) {
		observerList.remove(obj);
		}
	}

	@Override
	public void notifyObservers() {
		List<Observer> observersLocalList = null;
		//synchronization is used to make sure any observer registered after message is received is not notified
		synchronized (MUTEX) {
			if (!changed)
				return;
			observersLocalList = new ArrayList<>(this.observerList);
			this.changed=false;
		}
		for (Observer obj : observersLocalList) {
			obj.update();
		}

	}

	@Override
	public Object getUpdate(Observer obj) {
		return this.message;
	}
	
	//method to post message to the topic
	public void postMessage(String msg){
		System.out.println("Message Posted to Topic:"+msg);
		this.message=msg;
		this.changed=true;
		notifyObservers();
	}
}
