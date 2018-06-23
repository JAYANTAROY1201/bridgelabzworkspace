package com.bridgelab.designpattern.creationdesign.singleton.threadsafesingleton;

public class ThreadSafeSingleton {
private static ThreadSafeSingleton instance;
public String str;    
    private ThreadSafeSingleton(){
    	str="This is thread safe singleton";
    }
    
    public static synchronized ThreadSafeSingleton getInstance(){
        if(instance == null){
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
