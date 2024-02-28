package com.jdc.rev;

public class RevOopApp {
	public static void main(String[] args) {
		var app = new RevOopApp() {};
		app.runForInterface();
		CanCode cd  = new CanCode() {

			@Override
			public void doWork() {
				doDefault();
				
			}};cd.doDefault();
	}
	
	
	void runForInterface() {
		CanDo canDo = new CanDo() {

			@Override
			public void doWork() {
				System.out.println("Anno.CanDo => dowork()");
			}
			
		};
		canDo.doWork();
	}
}
