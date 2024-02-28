package com.jdc.rev;

public interface CanDeploy extends CanCode, CanTest {

	@Override
	default void doDefault() {
		CanCode.super.doDefault();
	}

	

}
