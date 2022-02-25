package com.nonsaticinnerclass;

public class CarOuterClass {

	int carPrize=20000;
	String carColor="Blue";

	public void carName(){
		System.out.println("Car Name Mahindra");
	}
	public static void main(String[] args) {
		CarOuterClass carOuterClass= new CarOuterClass();
		carOuterClass.carName();
		//CarOuterClass.EngineType engineType= carOuterClass.new EngineType();
		carOuterClass.engine();
	}
	public void engine() {
		EngineType engineType= new EngineType();
		engineType.engine();
	}
	class EngineType{
		public void engine(){
			System.out.println("Engine Diesel");
			//inner class can access all fields (members) of outer class 
			System.out.println("car prize : "+carPrize);//non static
			System.out.println("car color : "+carColor);//static
		}
	}

}
