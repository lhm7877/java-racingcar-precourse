package com.hoomin.racingcar;

import java.util.ArrayList;
import java.util.List;

import com.hoomin.racingcar.domains.Car;
import com.hoomin.racingcar.domains.Cars;
import com.hoomin.racingcar.domains.Name;
import com.hoomin.racingcar.domains.Racing;
import com.hoomin.racingcar.domains.RacingResult;
import com.hoomin.racingcar.domains.TotalRound;
import com.hoomin.racingcar.view.InputView;

/**
 * Cars를 만들고 racing을 시작하며 result를 print하는 Game에 대한 책임
 *
 */
public class RacingCarGame {
	public void start() {
		final List<String> carNames = InputView.getCarNames();
		Cars cars = new Cars(createCarsByCarNames(carNames));
		Racing racing = new Racing(cars, getTotalRound());
		final RacingResult racingResult = racing.start();
		racingResult.print();
	}

	private List<Car> createCarsByCarNames(List<String> carNames) {
		List<Car> cars = new ArrayList<>();
		for (String carName : carNames) {
			final Name name = new Name(carName);
			final Car car = new Car(name);
			cars.add(car);
		}
		return cars;
	}

	private TotalRound getTotalRound() {
		return new TotalRound(InputView.getTotalRound());
	}
}
