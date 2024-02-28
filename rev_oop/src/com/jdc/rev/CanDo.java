package com.jdc.rev;

public interface CanDo {
	int canDoVar = 100;
	
	void doWork();
	
	default void doDefault() {
		System.out.println("CanDo ==> doDefault()");
	}
	
	static void doStatic() {
		System.out.println("CanDo ==> doBefore() or doStatic");
	}
}


