package oop;

public class BoyForOveriding extends Human {
	//Overriding method
	
	@Override
	   public void eat(){
	      System.out.println("Boy is eating");
	   }
	
	   public static void main( String args[]) {
	      BoyForOveriding obj = new BoyForOveriding();
	      //This will call the child class version of eat()
	      obj.eat();
	   }
}
