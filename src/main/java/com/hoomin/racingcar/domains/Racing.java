package com.hoomin.racingcar.domains;

import com.hoomin.racingcar.view.OutputView;

public class Racing {
	private final Cars cars;
	private final TotalRound totalRound;

	public Racing(Cars cars, TotalRound totalRound) {
		this.cars = cars;
		this.totalRound = totalRound;
	}

	public Cars start() {
		OutputView.printRaceStart();
		for (int i = 0; i < totalRound.get(); i++) {
			cars.race();
			OutputView.printLine();
		};
		return cars.getWinners();
	}
}
