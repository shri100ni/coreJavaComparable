package oop;

public interface Vehicle {
	public void start() ;
	
	public static void stop(){
		System.out.println("stop called");
	}

	default void info() {
		System.out.println("ki bhaiya vehicle info");
	}
}
