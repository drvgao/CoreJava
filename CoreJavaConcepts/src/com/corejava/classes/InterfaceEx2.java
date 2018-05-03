package com.corejava.classes;
/**
 * @author RDURGAM
 * When there are two interfaces having same methods
 * the implementation class doesn't know to which method
 * it has to refer.
 * If it extends one interface, then it refers to that i/f.
 */
interface I1
{
	public void m1();
}

interface I2
{
	public int m1();
}

class  InterfaceEx2 implements I1//, I2
{
	public static void main(String[] args) 
	{
		I1 i1 = new InterfaceEx2();
//		I2  i2 = new InterfaceEx2();
		i1.m1();
//		i2.m1();
	}
	public void m1(){
		System.out.println("M1 Method");
	}
}
