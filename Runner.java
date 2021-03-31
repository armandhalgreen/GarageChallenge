package com.qa.intro;


public class Runner {
	public static void main (String[] args) {
		
		Motorbike motorbike= new Motorbike("Yamaha","Black");
		Van van =new Van("VolkswagenCaddy", "White");
		Car car = new Car("AudiQ7","White");
		
		Garage garage = new Garage();
		
		garage.PutVechileInGarage(car);
		garage.PutVechileInGarage(motorbike);
		garage.PutVechileInGarage(van);
		
		System.out.println(garage.ReturnVechilesInGarage());
		System.out.println(garage.BillOfGarage());
		
		
		garage.RemoveVechile("AudiQ7");
		System.out.println(garage.ReturnVechilesInGarage());
		
		garage.RemoveAllVechiles();
		System.out.println(garage.ReturnVechilesInGarage());
		
		
	}
}
