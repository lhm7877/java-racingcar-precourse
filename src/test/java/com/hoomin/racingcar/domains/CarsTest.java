package com.hoomin.racingcar.domains;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CarsTest {

	@ParameterizedTest
	@DisplayName("Cars 생성 테스트")
	@ValueSource(strings = {"6words", "abcdefg"})
	public void newCar_InvalidName_IllegalArgumentException(String name) {
		assertThatThrownBy(() -> new Car(name))
			.isInstanceOf(IllegalArgumentException.class);
	}

	@ParameterizedTest
	@DisplayName("Cars 생성 테스트")
	@ValueSource(strings = {"pobi", "crong", "honux"})
	public void newCar_ValidName_CreateInstance(String name) {
		assertThat(new Car(name))
			.isInstanceOf(Car.class);
	}
}
