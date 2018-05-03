package com.corejava.collections.set;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<String>();
		set.add("rajesh");
		set.add("santosh");
		set.add(null);
		System.out.println("elements: "+set);
	}

}
