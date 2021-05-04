package com.hoomin.racingcar;

import java.util.List;

import com.hoomin.racingcar.domains.Cars;
import com.hoomin.racingcar.domains.Racing;
import com.hoomin.racingcar.view.InputView;
import com.hoomin.racingcar.view.OutputView;

/**
 * Cars를 만들고 racing을 시작하며 result(게임 결과)를 print하는 Game에 대한 책임
 *
 */
public class RacingCarGame {
	public void start() {
		final List<String> carNames = InputView.getCarNames();
		final Integer totalRound = InputView.getTotalRound();

		Cars winnerCars = getWinnerCars(carNames, totalRound);

		OutputView.printWinners(winnerCars.getNames());
	}

	private Cars getWinnerCars(List<String> carNames, Integer totalRound) {
		Cars cars = Cars.fromCarNames(carNames);
		Racing racing = new Racing(cars, totalRound);
		return racing.start();
	}
}
