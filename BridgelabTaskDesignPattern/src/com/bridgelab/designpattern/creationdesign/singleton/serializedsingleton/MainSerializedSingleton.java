package com.bridgelab.designpattern.creationdesign.singleton.serializedsingleton;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class MainSerializedSingleton {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SerializedSingleton instanceOne = SerializedSingleton.getInstance();
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream(
                "/home/administrator/eclipse-workspace/BridgelabTaskDesignPattern/"
                + "src/com/bridgelab/designpattern/singleton/serializedsingleton/mySer.ser"));
        out.writeObject(instanceOne);
        out.close();
        
        //deserailize from file to object
        ObjectInput in = new ObjectInputStream(new FileInputStream(
                "/home/administrator/eclipse-workspace/BridgelabTaskDesignPattern/"
                + "src/com/bridgelab/designpattern/singleton/serializedsingleton/mySer.ser"));
        SerializedSingleton instanceTwo = (SerializedSingleton) in.readObject();
        in.close();
        
        System.out.println("instanceOne hashCode="+instanceOne.hashCode());
        System.out.println("instanceTwo hashCode="+instanceTwo.hashCode());
        
	}

}
