package oop;

public class TestVehicle {

	public static void main(String[] args) {
		Vehicle v1 = new Jeep();
		v1.start();
		v1.info();
		Vehicle.stop();

	}

}
