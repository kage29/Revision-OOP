package com.jdc.rev;

public interface CanCode extends CanDo {
	default void doDefault() {
		CanDo.super.doDefault();
		CanDo.doStatic();
		
		System.out.println("Cancode ==> doDefault()");
		
	}	
}

class A{
//	private A() {
//		
//	}can't be extends (constructor)
	static void aStatic() {
		System.out.println("A ==> aStatic()");
	}
}

class B extends A {
	void doB() {
		aStatic();
		System.out.println("B ==> bStatic()");
	}
}
