package com.qa.intro;

abstract public class Vechile {
	
	private String nameOfVechile;	
	private String stringNumberOfWheels;
	private String sizeOfEngine;
	private String colour;
	
	
	public String getNameOfVechile (){
		return nameOfVechile;
	}
	
	public void setNameOfVechile (String nameOfVechile){
		this.nameOfVechile=nameOfVechile;
	}
	
	public String getNumberOfWheels (){
		return stringNumberOfWheels;
	}
	
	public void setNumberOfWheels (String stringNumberOfWheels){
		this.stringNumberOfWheels= stringNumberOfWheels;
	}
		
	public String getSizeOfEngine (){
		return sizeOfEngine;
	}
	
	public void setSizeOfEngine (String sizeOfEngine){
		this.sizeOfEngine=sizeOfEngine;
	}	
	
	public String getColour (){
		return colour;
	}
	
	public void setColour (String colour){
		this.colour=colour;
	}
	
}

