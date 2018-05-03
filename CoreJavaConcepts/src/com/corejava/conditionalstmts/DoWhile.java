package com.corejava.conditionalstmts;

public class DoWhile {

	public static void main(String[] args) {
int option = 0;
do{
//show hotel menu options
System.out.println("Main Course");
System.out.println("Chicken Biryani");
System.out.println("Roti");
System.out.println("Pizza");
option = option + 2;
System.out.println("option: "+option);
}while(option == 10);

	}

}
