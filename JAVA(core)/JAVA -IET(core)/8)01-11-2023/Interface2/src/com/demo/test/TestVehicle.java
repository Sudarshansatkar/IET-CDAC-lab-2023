package com.demo.test;
import com.demo.beans.Vehicle;
import com.demo.service.Bike;
import com.demo.service.Car;

public class TestVehicle {

	public static void main(String[] args)
	{
		Bike b1=new Vehicle();
		b1.MileageBike();
		
		System.out.println();
		
		Car c1=new Vehicle();
		c1.MileageCar();

	}

}
