package com.hoomin.racingcar.domains;

public class TotalRound {
	private final int totalRound;

	public TotalRound(int totalRound) {
		this.totalRound = totalRound;
	}

	public int get() {
		return totalRound;
	}

	@Override
	public String toString() {
		return String.valueOf(totalRound);
	}
}
