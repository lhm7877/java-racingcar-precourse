package com.hoomin.racingcar.domains;

import java.util.Optional;

public class Car {
	public static final int MOVE_CONDITION_BASE_NUMBER = 4;

	private final Name name;
	private final Position position;

	public Car(Name name) {
		this.name = name;
		this.position = new Position();
	}

	public void race(Number number) {
		if (number.get() >= MOVE_CONDITION_BASE_NUMBER) {
			this.position.move();
		}
	}

	public Position getPosition() {
		return position;
	}

	public Name getName() {
		return name;
	}

	public Optional<Car> getNameByPosition(Position position) {
		if (this.position.equals(position)) {
			return Optional.of(this);
		}
		return Optional.empty();
	}

	@Override
	public String toString() {
		return name + " : " + position;
	}
}
