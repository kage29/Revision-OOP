package com.jdc.rev.lc;

import java.time.LocalDate;

public record User(String username, 
		String password,
		LocalDate assignAt,
		boolean deleted) {
	
	private static String str = "Hello";
	public void instMethod() {}
	public static void staMethod() {};
	
	
//	public String username() {// accessors like (get method)
//		if(null==username|| username.length()<=0) {
//			throw new RuntimeException("Incorrect Data!");
//		}
//		return username;
//	}
}
