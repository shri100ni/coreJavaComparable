package com.test.basic;

public class PrimeNumber {
	int num=0;
	int rem = 0;
	if (num != 2) {
		for (int i = 2; i <= num / 2; i++) {
			rem = num % i;
			if (rem == 0) {

				System.out.println("Number is not Prim :" + num);
				break;

			}
		}
		if (rem != 0) {
			System.out.println("number is  prime" + num);
			
		}
	} else {
		System.out.println("number is  prime" + num);
	}

}
}
