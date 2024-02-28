package com.jdc.rev.lc;

import java.time.LocalDate;

public class LangChangesApp {

	public static void main(String[] args) {
		User user1 = new User(null,"pyaephyo",
				LocalDate.now(),false);
		User user2 = new User("phyo","pyaephyo",
				LocalDate.now(),false);
		
		System.out.println(user1.username());
		System.out.println(user1.equals(user2));
		
		UserClass uc1 = new UserClass("phyo","pyaePhyo");
		UserClass uc2 = new UserClass("phyo","pyaePhyo");
		
		System.out.println(uc1);
		System.out.println(uc2);
		System.out.println(uc1==uc2);// literal aya check yin
		System.out.println(uc1.equals(uc2));// Object  net check
	}

}
