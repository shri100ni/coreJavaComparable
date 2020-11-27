package com.test.exception;

import java.io.FileNotFoundException;
import java.io.IOException;
 class CanNotDivideByZeroo extends RuntimeException{
	 private String msg;
	 public CanNotDivideByZeroo(String msg){
		 super(msg);
	 }
	 
 }
class P {
	public void m1() throws IOException {
	}

	public void m2() throws FileNotFoundException {
	}

	public void m3() throws RuntimeException {
	}

	public void m4() throws NullPointerException {
	}
	public void m5() {
	}
}

class C extends P {
	/*
	 * @Override public void m2() throws IOException { }
	 */

	public double devide(int a, int b) {
		if(b==0){
		 throw new CanNotDivideByZeroo("zeroo se ni bhagega");
		}
		return a / b;
	}

	@Override
	public void m1() throws RuntimeException {
	}

	@Override
	public void m3() throws IndexOutOfBoundsException {
	}

	/*@Override
	public void m4() throws FileNotFoundException {
	}
	@Override
	public void m5() throws FileNotFoundException {
	}*/
}

public class TestExcOver {

	public static void main(String[] args)throws RuntimeException {
		C c = new C();
		
		double result=c.devide(10, 0);
		
		System.out.println(result);
	}

}
