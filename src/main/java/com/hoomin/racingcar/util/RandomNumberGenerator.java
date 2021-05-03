package com.hoomin.racingcar.util;

import java.util.Random;

import com.hoomin.racingcar.domains.Number;

public class RandomNumberGenerator {
	private static final int RANGE_TEN = 10;
	private static final Random random = new Random();

	public static Number generateZeroToNine() {
		return new Number(random.nextInt(RANGE_TEN));
	}
}
