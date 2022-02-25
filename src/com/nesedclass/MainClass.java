package com.nesedclass;

import com.nesedclass.OuterClass.Inner;

public class MainClass {
	public static void main(String[] args) {
		OuterClass outerClass= new OuterClass();
		outerClass.outerClassMethod();

			Inner inner=new Inner();
			inner.InnerMethod();
		
		
	}
}