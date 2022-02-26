package com.annonymous;

public class Person {
	public static void main(String[] args) {
		Mobile mobile= new Mobile();
		mobile.call();
		Mobile smartPhone=new Mobile()
		{
			public void call() {
				System.out.println("VideoCall,AudioCall,GroupCall");
			}
		};		
		smartPhone.call();
	}
}
