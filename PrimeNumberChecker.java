package com.demo;

public class PrimeNumberChecker {
	public boolean validate(int primenumber) {

		for (int i = 2; i < primenumber / 2; i++) {

			if (primenumber % 1 == 0) {
				return false;
			}
		}
		return false;
	}

}
