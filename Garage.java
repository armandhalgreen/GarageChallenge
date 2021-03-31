package com.qa.intro;

import java.util.ArrayList;
import java.util.List;

public class Garage {
	
	public List<Vechile> VechilesInGarage = new ArrayList<>();
	public List<String> BillOfGarage = new ArrayList<>();
	public List<String> RemoveListOfVechilesInGarage = new ArrayList<>();

	
	public void PutVechileInGarage(Vechile vechile){
		VechilesInGarage.add(vechile);
	}
	
	
	public List<Vechile> ReturnVechilesInGarage(){
		return VechilesInGarage;
	}
	
	
	public List<String> BillOfGarage(){

		for (int i = 0; i < VechilesInGarage.size(); i++) {

			if (VechilesInGarage.get(i).toString().contains("Motorbike")) {
				 BillOfGarage.add("£2");
			} else if (VechilesInGarage.get(i).toString().contains("Car")) {
				 BillOfGarage.add("£3");
			} else if (VechilesInGarage.get(i).toString().contains("Van")) {
				 BillOfGarage.add("£4");
			}
		}

		return BillOfGarage;
	}
	
	
	public void RemoveVechile(String type) {
		int index = 0;
		for (int i = 0; i < VechilesInGarage.size(); i++ ) {
			if (VechilesInGarage.get(i).getNameOfVechile().equals(type)) {
				VechilesInGarage.remove(index);
			}
			index++;
		}
	}
	
	public void RemoveAllVechiles() {
		for (int i = 0; i <= VechilesInGarage.size(); i++ ) {
			VechilesInGarage.remove(0);
		}
	}
	
	
}
	