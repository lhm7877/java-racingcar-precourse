package com.hoomin.racingcar.domains;

import java.util.Collections;
import java.util.Objects;

public class Position {
	private int position;

	public int get() {
		return position;
	}

	public void move() {
		this.position++;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object)
			return true;
		if (object == null || getClass() != object.getClass())
			return false;
		return position == ((Position)object).position;
	}

	@Override
	public int hashCode() {
		return Objects.hash(position);
	}

	@Override
	public String toString() {
		return String.join("", Collections.nCopies(position, "-"));
	}
}
