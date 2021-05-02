package com.hoomin.racingcar.domains;

/**
 * 랜덤 생성된 Number
 * 이 Number는 0~9사이의 숫자임을 보장한다.
 *
 */
public class Number {
	private final int number;

	public Number(int number) {
		if ((number < 0 || number > 9)) {
			throw new IllegalArgumentException("0~9 사이의 숫자가 생성되지 않았습니다.");
		}
		this.number = number;
	}

	public int getNumber() {
		return number;
	}
}
