package com.hoomin.racingcar;

import java.util.Arrays;

import com.hoomin.racingcar.domains.Car;
import com.hoomin.racingcar.domains.Cars;
import com.hoomin.racingcar.domains.Name;
import com.hoomin.racingcar.domains.Racing;
import com.hoomin.racingcar.domains.RacingResult;
import com.hoomin.racingcar.domains.TotalRound;

public class RacingCarGame {
	public void start() {
		Cars cars = new Cars(Arrays.asList(new Car(new Name("a")), new Car(new Name("b")), new Car(new Name("c"))));
		Racing racing = new Racing(cars, new TotalRound(5));
		final RacingResult racingResult = racing.start();
		racingResult.print();
	}
}
