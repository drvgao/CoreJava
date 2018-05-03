package com.corejava.file;

public class StringsDemo {

	public static void main(String[] args) {
		 long startTime = System.currentTimeMillis();  //8:03
	        StringBuffer sb = new StringBuffer("Java");  //safe, not efficient
	        for (int i=0; i<100000; i++){  
	            sb.append("Hello");  //JavaHelloHelloHello..10,000
	        }  //8:04
	        System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
	        
	        startTime = System.currentTimeMillis();  
	        StringBuilder sb2 = new StringBuilder("Java");  //not safe, efficient
	        for (int i=0; i<100000; i++){  
	            sb2.append("Hello");  
	        }  
	        System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");
	        System.out.println(sb2);//JavaHello
	    }  
}
