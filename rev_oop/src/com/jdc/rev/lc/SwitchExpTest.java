package com.jdc.rev.lc;

import java.time.DayOfWeek;
import java.time.LocalDate;


public class SwitchExpTest {
	public static void main(String[] args) {
		String result = anotherModernSwitch(LocalDate.now().minusDays(6));
		System.out.println("This day is \"%s\"".formatted(result));
		
	}
	static String anotherModernSwitch(LocalDate date) {
		return switch(convertDateToDays(date)) {
		case MONDAY,
		TUESDAY,
		THURSDAY,
		FRIDAY ->"Full Work Days.";
		case WEDNESDAY -> "Half Work Day";
		case SATURDAY,SUNDAY -> "Holiday";
		default->
			throw new RuntimeException("Something Wrong!");
		};
	}
	static String modernSwitch(LocalDate date) {
		return switch(convertDateToDays(date)){
			case MONDAY,
			TUESDAY,
			THURSDAY,
			FRIDAY: yield "Full Work Day";
			case WEDNESDAY:yield "Half Work Day";
			case SATURDAY,SUNDAY:yield "Holiday";
			default: 
				throw new RuntimeException("Something Wrong! ");
		};	
	}
	
	static String oldSwitch (LocalDate date) {
		Days day= convertDateToDays(date);
		String result = null;
		
		switch(day) {
		case MONDAY,
			TUESDAY,
			THURSDAY,
			FRIDAY:result="Full Work Day";
		break;
		case WEDNESDAY: result ="Half Work Day";
		break;
		case SUNDAY,
			SATURDAY:result="Holiday";
		break;
		}
		
		return result;
	}
	
	// LocalDate.of(2022,10,18);
	private static Days convertDateToDays(LocalDate date) {
		DayOfWeek dayOfWeek = date.getDayOfWeek();
		String dayOfWeekSrt = dayOfWeek.toString();
		return Days.valueOf(dayOfWeekSrt);
		// or
//		return Days.valueOf(date.getDayOfWeek().toString());
	}
	enum Days{
		SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY
	}
}










