package com.hoomin.racingcar.domains;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Cars {
	private final List<Car> cars;

	public Cars(List<Car> cars) {
		this.cars = cars;
	}

	public Car getWinner() {
		return Collections.max(cars, Comparator.comparing(Car::getPosition));
	}
}
