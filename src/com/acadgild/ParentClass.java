package com.acadgild;

/**
 * 
 * In this class we have declared the display method as final.
 * In the ChildClass we will try to override this method.
 *
 */
public class ParentClass {
	final void display(){
		System.out.println("This is the display method of the parent class");
	}
}
