package com.bridgelab.designpattern.creationdesign.singleton.eagerinitialization;

public class EagerInitialization {
private static final EagerInitialization inst = new EagerInitialization();
public String str;    
    //private constructor to avoid client applications to use constructor
    private EagerInitialization(){
    	str="This is eager Initialization";
    }

    public static EagerInitialization getInstance(){
        return inst;
    }
}
