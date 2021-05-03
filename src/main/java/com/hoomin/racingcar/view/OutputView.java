package com.hoomin.racingcar.view;

import java.util.ArrayList;
import java.util.List;

import com.hoomin.racingcar.domains.Car;
import com.hoomin.racingcar.domains.Name;

public class OutputView {
	public static void printWinners(List<Name> names) {
		List<String> nameStrings = new ArrayList<>();
		for (Name name : names) {
			nameStrings.add(name.get());
		}
		System.out.println(String.join(",", nameStrings) + "가 최종 우승했습니다.");
	}

	public static void printCar(Car car) {
		System.out.println(car);
	}

	public static void printRaceStart() {
		System.out.println("실행 결과");
	}

	public static void printLine() {
		System.out.println();
	}
}
