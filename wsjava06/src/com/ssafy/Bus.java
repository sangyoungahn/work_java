package com.ssafy;

public class Bus extends Car {
	public static final int M_SEAT = 5;
	int seat;

	public Bus(String num, String model, int price) {
		this(num, model, price, M_SEAT);
	}
	
	public Bus(String num, String model, int price, int seat) {
		super(num, model, price);
		this.seat = seat;
	}

	public Bus() {	}

	public int getSeat() {
		return seat;
	}

	public void setSeat(int seat) {
		this.seat = seat;
	}

	@Override
	public String toString() {
		return super.toString() + "Bus [seat=" + seat + "]";
	}

	
	
}
