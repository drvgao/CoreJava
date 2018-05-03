package com.corejava.oop;

/******************************************************************************
 * Compilation: javac HelloWorld.java Execution: java HelloWorld
 *
 * Prints "Hello, World". By tradition, this is everyone's first program.
 *
 * % java HelloWorld Hello, World
 *
 * These 17 lines of text are comments. They are not part of the program; they
 * serve to remind us about its properties. The first two lines tell us what to
 * type to compile and test the program. The next line describes the purpose of
 * the program. The next few lines give a sample execution of the program and
 * the resulting output. We will always include such lines in our programs and
 * encourage you to do the same.
 *
 ******************************************************************************/

public class HelloWorld {
	public static void main(String[] args) {
		ConstructorDemo constructDemo = new ConstructorDemo();
		ConstructorDemo constructDemo2 = new ConstructorDemo("Gowtham", 24, 92834134);
		
		System.out.println(constructDemo2.getName());
	}
}
