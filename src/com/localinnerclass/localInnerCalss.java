package com.localinnerclass;

//localInnerCalss.class
public class localInnerCalss {	
	public  void getValue() {
		int sum=20;
		//localInnerCalss$1Inner.class
		class Inner{
			public int divisor;
			public int remainder;
			public Inner() {
				divisor=4;
				remainder=sum%divisor;
			}
			private int getDiviser() {
				return divisor;
			}
			private int getRemainder() {
				return sum%divisor;
			}
			private int getQuetient() {
				System.out.println("Inside inner class");
				return sum/divisor;			
			}
		}
		Inner inner = new Inner();
		System.out.println(inner.getDiviser());
		System.out.println(inner.getRemainder());
		System.out.println(inner.getQuetient());
	}
	public static void main(String[] args) {
		localInnerCalss localInnerCalss=new localInnerCalss();
		localInnerCalss.getValue();
	}
}