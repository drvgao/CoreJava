package com.corejava.conditionalstmts;

public class ForDemo {

	public static void main(String[] args) {
		//initialization, one time.
		// check i <= 5
		//executes the code
		//increments by 1 (i++ executed)
		/*for(int i = 30; i>2; i=i-2){
//		for(int i = 1; i<=5 ; i++) {
			System.out.println("i: "+i);
			if(i == 4){
				break; //exits
//				continue;
			}
			System.out.println("check how continue works.");//continue
			}*/
		
		String str = "Hello";
		for(int i=0; i<=str.length(); i++){
			System.out.println(str.substring(i));//index i to last
		}
	}

}
