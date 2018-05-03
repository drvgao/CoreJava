package com.corejava;

public class ArithematicOperationsDemo {

	public static void main(String[] args) {
		// Arithmetic --> + , - , * , / , %
		int num1=5;
		int num2=3;
		System.out.println("sum is: "+(num1+num2));
		
		System.out.println("subtraction: "+(num1-num2));

		System.out.println("mul: "+(num1*num2));
		
		System.out.println("div: "+ (num1/num2));//quotient 
		
		System.out.println("mod: "+(num1%num2));//reminder
		
		String firstString = "This is";
        String secondString = " a concatenated string.";
        String thirdString = firstString+secondString;
        System.out.println(thirdString);
        
        //unary
        System.out.println(-num1);
        num1 = -78;
        System.out.println(-num1);

        System.out.println("num2: "+(++num2));//4
        System.out.println(num2++);//Prints value, then increments by 1
        System.out.println("num2 after++: "+num2);//5
        
        boolean success = false;
        System.out.println(success);//false
        System.out.println(!success);//true
	}

}
