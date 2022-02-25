package com.nesedclass;

public class OuterClass {
	int number=6;
	public void outerClassMethod() {
		int num=number;
		System.out.println("outerClassMethod : "+num);
	}
	public static class Inner{
		int innerNumber=8;
		public void InnerMethod(){
			int num=innerNumber;
			System.out.println("InnerMethod : "+innerNumber);
		}
	}
}
