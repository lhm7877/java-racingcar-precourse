package com.hoomin.racingcar.domains;

import static org.assertj.core.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class CarsTest {

	@ParameterizedTest
	@DisplayName("우승자구하기_pobi가 가장 많이 전진_우승자pobi")
	@CsvSource(value = {"pobi:4:5", "hoo:1:4", "min:1:2"}, delimiter = ':')
	public void getWinner_pobiMovesMost_WinnerIsPobi(String name, Integer firstNumber, Integer secondNumber) {
		final Car pobiCar = createMovedCar(name, Arrays.asList(new Number(firstNumber), new Number(secondNumber)));
		final Car hooCar = createMovedCar(name, Arrays.asList(new Number(firstNumber), new Number(secondNumber)));
		final Car minCar = createMovedCar(name, Arrays.asList(new Number(firstNumber), new Number(secondNumber)));
		final Cars cars = new Cars(Arrays.asList(pobiCar, hooCar, minCar));
		assertThat(cars.getWinners().get(0)).isEqualTo(pobiCar);
	}

	private Car createMovedCar(String name, List<Number> numbers) {
		final Car car = new Car(name);
		for (Number number : numbers) {
			car.race(number);
		}
		return car;
	}
}
