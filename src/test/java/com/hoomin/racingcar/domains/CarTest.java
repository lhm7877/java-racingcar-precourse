package com.hoomin.racingcar.domains;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class CarTest {

	@ParameterizedTest
	@DisplayName("Car 생성_6글자 이상의 이름_IllegalArgumentException")
	@ValueSource(strings = {"6words", "abcdefg"})
	public void newCar_InvalidName_IllegalArgumentException(String name) {
		assertThatThrownBy(() -> new Car(name))
			.isInstanceOf(IllegalArgumentException.class);
	}

	@ParameterizedTest
	@DisplayName("Car 생성_1~5 글자의 이름_CreateInstance")
	@ValueSource(strings = {"pobi", "crong", "honux"})
	public void newCar_ValidName_CreateInstance(String name) {
		assertThat(new Car(name))
			.isInstanceOf(Car.class);
	}


	@ParameterizedTest
	@DisplayName("경주_4이상의 숫자_전진")
	@ValueSource(ints = {4,5,6,7,8,9})
	public void race_NumberMoreThanOrEqualTo4_Move(int integer) {
		final Number number = new Number(integer);
		final Car car = new Car("pobi");
		car.race(number);
		assertThat(car.getPosition().get()).isEqualTo(1);
	}

	@ParameterizedTest
	@DisplayName("경주_3이하의 숫자_멈춤")
	@ValueSource(ints = {0,1,2,3})
	public void race_NumberMoreThanOrEqualTo4_NotMove(int integer) {
		final Number number = new Number(integer);
		final Car car = new Car("pobi");
		car.race(number);
		assertThat(car.getPosition().get()).isEqualTo(0);
	}
}
