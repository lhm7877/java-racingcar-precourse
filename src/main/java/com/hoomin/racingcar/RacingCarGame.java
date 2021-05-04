package com.hoomin.racingcar;

import java.util.List;

import com.hoomin.racingcar.domains.Cars;
import com.hoomin.racingcar.domains.Name;
import com.hoomin.racingcar.domains.Racing;
import com.hoomin.racingcar.view.InputView;
import com.hoomin.racingcar.view.OutputView;

/**
 * Cars를 만들고 racing을 시작하며 result를 print하는 Game에 대한 책임
 *
 */
public class RacingCarGame {
	public void start() {
		final List<String> carNames = InputView.getCarNames();
		Cars cars = Cars.fromCarNames(carNames);
		Racing racing = new Racing(cars, getTotalRound());
		Cars winnerCars = racing.start();
		final List<Name> names = winnerCars.getNames();
		OutputView.printWinners(names);
	}

	private Integer getTotalRound() {
		return InputView.getTotalRound();
	}
}
