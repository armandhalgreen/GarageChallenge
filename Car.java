package com.qa.intro;


public class Car extends Vechile{

private String numberOfWheels="4";
private String sizeOfEngine="M";
	

	public Car(String nameOfVechile, String colour){

		this.setNameOfVechile(nameOfVechile);
		this.setNumberOfWheels(numberOfWheels);
		this.setSizeOfEngine(sizeOfEngine);
		this.setColour(colour);

	}
}
