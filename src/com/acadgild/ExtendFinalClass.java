package com.acadgild;

/**
 * 
 * In this demo we are trying to extend a final class - FinalClass
 * Also, we are declaring the constructor as final
 * -----------------------------------------------------------------------------------
 * Output -  
 * 		i. The type ExtendFinalClass cannot subclass the final class FinalClass
 * 		ii. Illegal modifier for the constructor in type ExtendFinalClass
 * ------------------------------------------------------------------------------------
 * Conclusion -
 * 		i. We cannot extend a class declared as final
 * 		ii. A constructor cannot be declared as final
 * -------------------------------------------------------------------------------------
 */
public class ExtendFinalClass extends FinalClass {

	final ExtendFinalClass() {
		// TODO Auto-generated constructor stub
	}
	
	void display() {
		System.out.println("Display method");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExtendFinalClass e = new ExtendFinalClass();
		e.display();
	}

}
