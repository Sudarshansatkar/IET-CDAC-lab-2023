package com.demo.beans;
import com.demo.service.Bike;
import com.demo.service.Car;

public class Vehicle implements Car,Bike
{

	@Override
	public void MileageBike() {
		System.out.println("Bike Mileage is 50kmpl");
		
	}

	@Override
	public void MileageCar() {
	
		System.out.println("Car Mileage is 22kmpl");
		
	}



}
