package com.hoomin.racingcar.domains;

public class Car {
	private final Name name;
	private final Position position;

	public Car(String name) {
		this.name = new Name(name);
		this.position = new Position();
	}

	public void race(Number number) {
		if (number.getNumber() >= 4) {
			this.position.movePosition();
		}
	}

	public Integer getPosition() {
		return position.getPosition();
	}
}
