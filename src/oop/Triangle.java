package oop;

public class Triangle {
	private int a;
	private int b;
	private int c;

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public void area() {
     int area=a*b*c;
     System.out.println("area is====>"+area);
	}

	public void perimeter() {
		int area=a+b+c;
	     System.out.println("perimeter is====>"+area);
	}

}
