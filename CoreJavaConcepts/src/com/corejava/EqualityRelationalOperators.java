package com.corejava;

public class EqualityRelationalOperators {

	public static void main(String[] args) {
		//comparision operators
		// == equal to
		// != not equal to
		// > greater than
		// >= greater than or equal to
		// < less than
		// <= less than or equal to
		
		int value1 = 2;
		int value2 = 2;
		if (value1 == value2)
			System.out.println("value1 == value2 is "+(value1 == value2));//skip
		if (value1 != value2)
			System.out.println("value1 != value2");
		if (value1 > value2)
			System.out.println("value1 > value2");
		if (value1 < value2)
			System.out.println("value1 < value2");
		if (value1 <= value2)
			System.out.println("value1 <= value2 "+(value1 <= value2));
		
		//conditional operators
		int num1 = 1;
        int num2 = 3;
        if((num1 == 1) && (num2 == 2))//false
            System.out.println("num1 is 1 AND num2 is 2");
        if((num1 == 1) || (num2 == 2))//true
            System.out.println("num1 is 1 OR num2 is 2");
       
        value2=5;
        boolean someCondition = false;
        
        int result = (value1 > value2) ? value1 : value2;//true-->var1; false-->var2 value
        System.out.println("value1: "+value1+" value2: "+value2);
        System.out.println("result: "+result);
        
        ArithematicOperationsDemo aod = new ArithematicOperationsDemo();
        System.out.println(aod instanceof ArithematicOperationsDemo);//true

	}
}
