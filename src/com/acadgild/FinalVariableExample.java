package com.acadgild;

/**
 * 
 * Example to show the use of Final Variable Final variable value cannot be
 * over-ridden
 * -------------------------------------------------------------------------
 * Output - The final field FinalVariableExample.height cannot be assigned
 * -------------------------------------------------------------------------
 * Conclusion - A variable declared as final cannot be assigned a new value
 * -------------------------------------------------------------------------
 */
public class FinalVariableExample {

	// Declare and set the final variable height to 5;
	final int height = 5;

	// Method which will try to override the final variable
	void setHeight() {
		// Cannot assign value of 10 as it is final variable
		height = 10;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FinalVariableExample f = new FinalVariableExample();
		f.setHeight();

	}

}
