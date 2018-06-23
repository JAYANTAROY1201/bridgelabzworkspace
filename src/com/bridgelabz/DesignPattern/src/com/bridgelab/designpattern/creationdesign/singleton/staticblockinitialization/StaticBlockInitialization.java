package com.bridgelab.designpattern.creationdesign.singleton.staticblockinitialization;

public class StaticBlockInitialization {
private static StaticBlockInitialization instance;
public String str;    
    private StaticBlockInitialization(){
    	str="THIS IS STATIC BLOCK INITIALIZATION CONCEPT";
    }
    
    //static block initialization for exception handling
    static{
        try{
            instance = new StaticBlockInitialization();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }
    
    public static StaticBlockInitialization getInstance(){
        return instance;
    }
}


