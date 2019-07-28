package com.ssafy;

public class Truck extends Car {
	public static final int M_TON = 1;
	int ton;

	public Truck(String num, String model, int price) {
		this(num, model, price, M_TON);
	}
	
	public Truck(String num, String model, int price, int ton) {
		super(num, model, price);
		this.ton = ton;
	}

	public Truck() {	}

	public int getTon() {
		return ton;
	}

	public void setTon(int ton) {
		this.ton = ton;
	}

	public static int getmTon() {
		return M_TON;
	}

	@Override
	public String toString() {
		return super.toString() + "Truck [ton=" + ton + "]";
	}
	
	
}
