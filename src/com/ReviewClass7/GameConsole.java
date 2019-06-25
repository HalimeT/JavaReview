package com.ReviewClass7;

public class GameConsole {
	String controller;
	String powerSource;
	boolean cd;
	boolean ifTvNeeded;
	int numberOfController;
	
	void ableToPlay() {
		System.out.println("I can play games");
	}
	
	 void readDisk() {
		System.out.println("I can read game disk");
	}
	
     boolean surfWeb() {
    	 return true;
     }
     boolean portAble() {
    	 return true;
     }
}
