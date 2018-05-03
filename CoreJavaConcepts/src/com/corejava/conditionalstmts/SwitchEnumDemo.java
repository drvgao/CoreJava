package com.corejava.conditionalstmts;

public class SwitchEnumDemo {
	public static void main(String args[]) {
		Car c;
		c = Car.switf;
		switch (c) {
		case switf:
			System.out.println("You choose swift!");
			break;
		case tata:
			System.out.println("You choose tata!");
			break;
		case audi:
			System.out.println("You choose audi!");
			break;
		case fiat:
			System.out.println("You choose fiat!");
			break;
		case honda:
			System.out.println("You choose honda!");
			break;
		default:
			System.out.println("I don't know your car.");
			break;
		}
	}

	enum Car {
		switf, tata, audi, fiat, honda
	}
}
