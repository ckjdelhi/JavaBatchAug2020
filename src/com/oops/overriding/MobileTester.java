package com.oops.overriding;

public class MobileTester {

	public static void main(String[] args) {
		
		MobileService client1 =new MobileClient1();
		client1.makeCalls();
		client1.receiveCalls();
		client1.browseInternet();
		client1.redial();
		//client1.touchScreen();

	}

}
