package com.bridgelab.designpattern.creationdesign.singleton.billpughsingleton;

public class BillPughSingleton {
	public String str;
	 private BillPughSingleton(){
		 str="This is bill pugh singleton";
	 }
	    
	    private static class SingletonHelper{
	        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	    }
	    
	    public static BillPughSingleton getInstance(){
	        return SingletonHelper.INSTANCE;
	    }
}
