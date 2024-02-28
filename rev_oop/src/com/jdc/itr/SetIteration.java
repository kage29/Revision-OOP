package com.jdc.itr;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;

public class SetIteration {
	public static void main(String[] args) {
		Set<Integer> iset = new HashSet<>(Set.of(1,2,3,5,6,7,8,4));
//		foreachTest(iset);
		test2(iset);
	}
	
	public static void foreachTest(Set<Integer> set) {//interface consumer
		set.forEach(new Consumer<Integer>() {
			public void accept (Integer data) {
				System.out.println(data);
			}
		});
	}
	
	public static void test2(Set<Integer> set) {
		for(Integer i:set) {
			System.out.println(i);
		}
	}
	
	public static void test3(Set<String> set) {
		for(String i:set) {
			System.out.println(i);
		}
	}
	
	
}
