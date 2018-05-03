package com.corejava.enums;

import java.util.Scanner;

public class EnumDemo2 {
	enum Size {
		SMALL, MEDIUM, LARGE, EXTRALARGE
	};

	public int getPizzePrice(Size size) {
		switch (size) {
		case SMALL:
			System.out.println();
			return 100;//expected 120
		case MEDIUM:
			System.out.println("");
			
			return 200;
		default:
			return 400;
		}
	}
	
	
	public int getOrder(String customerName, int mobileNo){
		int order=0;
		System.out.println("Tell me you are order: 1. small pizza; 2.medium; 3.large");
//		Scanner scanner = new Scanner();
		order = 1;
		return order;
	}
	
	public boolean isEvenNumber(int number){
        
        boolean result = false;
        if(number%2 == 1)//bug 100%2 = 0 11%=1
        	{
            result = true;//even number
        }
        return result;//false, odd number
    }
	
	public int sum(int a, int b){
		return a-b;
	}

}
