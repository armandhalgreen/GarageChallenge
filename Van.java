package com.qa.intro;


public class Van extends Vechile{

private String numberOfWheels="4";
private String sizeOfEngine="L";
	

	public Van(String nameOfVechile, String colour){

		this.setNameOfVechile(nameOfVechile);
		this.setNumberOfWheels(numberOfWheels);
		this.setSizeOfEngine(sizeOfEngine);
		this.setColour(colour);

	}
}
