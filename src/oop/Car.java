package oop;

public class Car {
	
	private Engine engine;
	
	private Stepney stepney;
	
	public Car(Engine engine){
		this.engine=engine;
	}
	public void start(){
		engine.start();
	}
}
