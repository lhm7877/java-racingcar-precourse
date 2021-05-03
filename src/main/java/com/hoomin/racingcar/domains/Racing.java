package com.hoomin.racingcar.domains;

public class Racing {
	private final Cars cars;
	private final TotalRound totalRound;

	public Racing(Cars cars, TotalRound totalRound) {
		this.cars = cars;
		this.totalRound = totalRound;
	}

	public RacingResult start() {
		for (int i = 0; i < totalRound.get(); i++) {
			cars.race();
		}
		return new RacingResult();
	}
}
