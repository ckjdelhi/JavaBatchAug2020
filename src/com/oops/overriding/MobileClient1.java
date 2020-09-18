package com.oops.overriding;

public class MobileClient1 extends MobileService{
	void makeCalls() {
		System.out.println("MobileClient1: makeCalls");
	}
	void receiveCalls() {
		System.out.println("MobileClient1: receiveCalls");
	}
	void touchScreen() {
		System.out.println("MobileClient1: touchScreen");
	}
}
