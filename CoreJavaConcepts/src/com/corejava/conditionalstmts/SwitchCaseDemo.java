package com.corejava.conditionalstmts;
/**
 * @author RDURGAM
 * A switch is really saying "pick one of these based on this variables value" 
 * but an if statement or other is just a series of boolean checks.
 */
public class SwitchCaseDemo {

	public static void main(String[] args) {
		int day = 3;
		String dayString = null;
		switch (day) {
		case 1:
			dayString = "Sunday";
			break;
		case 2:
			dayString = "Monday";
			break;
		case 3:
			dayString = "Tuesday";
			break;
		case 4:
			dayString = "Wednesday";
			break;
		case 5:
			dayString = "Thursday";
			break;
		case 6:
			dayString = "Friday";
			break;
		case 7:
			dayString = "Saturday";
			break;
		default:
			dayString = "Invalid day";
			break;
		}
		System.out.println(dayString);

	}

}
