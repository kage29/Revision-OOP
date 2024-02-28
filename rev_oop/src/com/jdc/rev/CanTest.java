package com.jdc.rev;

public interface CanTest extends CanDo{
	@Override
	default void doDefault() {
		CanDo.super.doDefault();
		System.out.println("CanTest ==> doDefault()");
	}
}


