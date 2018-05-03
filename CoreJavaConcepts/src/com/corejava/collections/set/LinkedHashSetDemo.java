package com.corejava.collections.set;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("rajesh");
		set.add("santosh");
		set.add(null);
		System.out.println("elements: "+set);
	}

}
