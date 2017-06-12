package com.acadgild;

/**
 * 
 * ChildClass trying to override the final method (display) of Parent Class
 * ----------------------------------------------------------------------------
 * Output - Cannot override final method from ParentClass
 * ----------------------------------------------------------------------------
 * Conclusion - a method declared as final cannot be overridden by the SubClass
 * ----------------------------------------------------------------------------
 */
public class ChildClass extends ParentClass {

	// Display method cannot be overridden as its declared final in the
	// ParentClass
	void display() {
		System.out.println("This is the display method of child class");
	}

	public static void main(String args[]) {
		ChildClass c = new ChildClass();
		ChildClass.display();
	}

}
