package com.hoomin.racingcar.domains;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.hoomin.racingcar.util.RandomNumberGenerator;

public class Cars {
	private final List<Car> cars;

	public Cars(List<Car> cars) {
		this.cars = cars;
	}

	void race() {
		for (Car car : cars) {
			car.race(RandomNumberGenerator.generateZeroToNine());
			car.print();
		}
	}

	public Car getCar(int index) {
		return cars.get(index);
	}

	public Car getWinner() {
		return Collections.max(cars, Comparator.comparing(Car::getPosition));
	}
}
