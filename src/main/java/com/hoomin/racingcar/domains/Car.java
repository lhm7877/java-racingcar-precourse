package com.hoomin.racingcar.domains;

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
			this.position.movePosition();
		}
	}

	public Integer getPosition() {
		return position.getPosition();
	}

	public void print() {

	}
}
