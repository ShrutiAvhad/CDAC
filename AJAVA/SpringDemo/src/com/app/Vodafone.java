package com.app;

public class Vodafone implements Sim{

	public Vodafone() {
		System.out.println("Default constructor");
	}
	
	@Override
	public void calling() {
		System.out.println("calling using voda sim");
	}

	@Override
	public void data() {
		System.out.println("browsing data using voda sim");
	}

}
