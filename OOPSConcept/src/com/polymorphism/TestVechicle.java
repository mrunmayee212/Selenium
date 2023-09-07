package com.polymorphism;

public class TestVechicle {

	public static void main(String[] args) {

		BaseVehicle vehicle1 = new BaseVehicle();
		vehicle1.speed();

		BaseVehicle vehicle2 = new DynamicBindingVehicle();

		// has a relationship child

		vehicle2.speed();

	}

}
