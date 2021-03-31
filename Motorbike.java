package com.qa.intro;


public class Motorbike extends Vechile{

private String numberOfWheels="2";
private String sizeOfEngine="S";
	

	public Motorbike(String nameOfVechile, String colour){

		this.setNameOfVechile(nameOfVechile);
		this.setNumberOfWheels(numberOfWheels);
		this.setSizeOfEngine(sizeOfEngine);
		this.setColour(colour);

	}
}

