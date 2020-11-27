package oop;

public class Jeep implements Vehicle {

	@Override
	public void start() {
		System.out.println("jeep starting");
	}
	@Override
	public static void stop(){
		System.out.println("stop called");
	}
}
