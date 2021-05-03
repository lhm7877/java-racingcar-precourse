package com.hoomin.racingcar.domains;

public class Name {
	private static final int MAX_SIZE = 5;

	private final String name;

	public Name(String name) {
		if (name == null || name.length() > MAX_SIZE) {
			throw new IllegalArgumentException("이름은 5자 이하만 가능합니다.");
		}
		this.name = name;
	}

	public String get() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}
}
