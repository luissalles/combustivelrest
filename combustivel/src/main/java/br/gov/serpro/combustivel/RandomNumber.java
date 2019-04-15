package br.gov.serpro.combustivel;

import java.util.Random;

public class RandomNumber {

	static double getRandomNumberInRange(double min, double max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return min + (max - min) * r.nextDouble();
	}
}
