package com.staticinnerclass;

import com.staticinnerclass.OuterClass.InnerClass;

class OuterClass {
	static int outerA=10;
	static int outerB=20;
	private static int outerPrivate=30;

	static class InnerClass{
		void display() {
			System.out.println("outerA : "+outerA);
			System.out.println("outerB : "+outerB);
			System.out.println("outerPrivate"+outerPrivate);
		}
	}
}
public class MainClass {
	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		OuterClass.InnerClass innerClass = new InnerClass(); 
		innerClass.display();
	}
}			