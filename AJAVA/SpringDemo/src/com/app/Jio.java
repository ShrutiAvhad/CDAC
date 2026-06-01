package com.app;

public class Jio implements Sim{
	public Jio() {
		System.out.println("Default constructor");
	}
	
	@Override
	public void calling() {
		System.out.println("calling using jio sim");
	}

	@Override
	public void data() {
		System.out.println("browsing data using Jio sim");
	}
}
