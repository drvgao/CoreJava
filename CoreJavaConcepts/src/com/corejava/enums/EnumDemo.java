package com.corejava.enums;

import com.corejava.enums.EnumDemo2.Size;

public class EnumDemo {

	public static void main(String[] args) {
		EnumDemo2 en = new EnumDemo2();
		System.out.println(en.getPizzePrice(Size.MEDIUM));
	}
}
