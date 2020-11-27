package com.test.basic;

public class A {
	public static void main(String ar[]) {
		long currentTme = System.currentTimeMillis();
		for (long c = 0; c < 1111111111; c++) {
			int x = 10;
			int y = 5;
			if (x > y) {
				x++;
			} else {
				y++;
			}

		}
		for (long c = 0; c < 1111111111; c++) {
			int x = 10;
			int y = 5;
			if (x > y) {
				x++;
			} else {
				y++;
			}
		}
		for (long c = 0; c < 1111111111; c++) {
			int x = 10;
			int y = 5;
			if (x > y) {
				x++;
			} else {
				y++;
			}
		}
		for (long c = 0; c < 1111111111; c++) {
			int x = 10;
			int y = 5;
			if (x > y) {
				x++;
			} else {
				y++;
			}
		}

		long currenttimeExecuted = System.currentTimeMillis();
		System.out.println(currenttimeExecuted - currentTme);

	}

}

class Mammel {
	public void speak() {

	}
}
