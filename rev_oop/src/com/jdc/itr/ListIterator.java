package com.jdc.itr;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ListIterator {
	public static void main(String[] args) {
		
		List<String> sList = new ArrayList<>(List.of("A","B","C","D"));
		legacyfor(sList);
//		intenalITR(sList);
	}
	
	public static void intenalITR(List<String> list) {
		list.forEach(new Consumer<String>() {
			public void accept(String dataS) {
				System.out.println(dataS);
			}
		});// internal Iteration
	}
	public static void legacyfor(List<String> list) {
		for(Integer i =0;i <	 list.size(); i++) {
			System.out.println(list.get(i));
		}
	}
}
