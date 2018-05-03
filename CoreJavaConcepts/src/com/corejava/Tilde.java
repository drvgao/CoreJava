package com.corejava;

public class Tilde {

	public static void main(String[] args) {
		//3 = 00000000000000000000000000000011
		//-4 = 11111111111111111111111111111100
		//In JVM’s implementation this equals to -4.
		int x=3;
        int y=~x;

        System.out.println(x);
        System.out.println(y);
	}

}
