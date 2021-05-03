package com.hoomin.racingcar.domains;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.hoomin.racingcar.util.RandomNumberGenerator;
import com.hoomin.racingcar.view.OutputView;

public class Cars {
	private final List<Car> cars;

	public Cars(List<Car> cars) {
		this.cars = cars;
	}

	public Car get(Integer index) {
		return cars.get(index);
	}

	void race() {
		for (Car car : cars) {
			car.race(RandomNumberGenerator.generateZeroToNine());
			OutputView.printCar(car);
		}
	}

	public Cars getWinners() {
		final Position winnerPosition = Collections.max(this.cars, Comparator.comparing(car -> car.getPosition().get())).getPosition();
		List<Car> cars = new ArrayList<>();
		for (Car car : this.cars) {
			car.getNameByPosition(winnerPosition)
				.ifPresent(cars::add);
		}
		return new Cars(cars);
	}

	public List<Name> getNames() {
		List<Name> names = new ArrayList<>();
		for (Car car : this.cars) {
			names.add(car.getName());
		}
		return names;
	}
}