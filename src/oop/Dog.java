package oop;

public class Dog extends Anymal {
	/*public Dog() {
		super(name);
		// TODO Auto-generated constructor stub
	}*/
	public Dog(String name) {
		super(name);
		
	}
	public void print(){
		super.name="moti";
		System.out.println(super.name);
		
	}

}
