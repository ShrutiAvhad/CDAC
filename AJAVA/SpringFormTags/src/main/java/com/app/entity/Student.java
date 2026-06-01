package com.app.entity;

import java.util.*;

public class Student {
	
	private String firstname;
	private String lastname;
	private String country;
	private Map<String,String>CountryOptions;
	private String favoriteLanguage;
	private String[] operatingSystems;
	
	public Student()
	{
		CountryOptions = new HashMap<String,String>();
		CountryOptions.put("IN", "India");
		CountryOptions.put("UK", "United-Kingdom");
		CountryOptions.put("DE", "Germany");
		CountryOptions.put("FR", "France");
		CountryOptions.put("BR", "Brazil");
	}
}
