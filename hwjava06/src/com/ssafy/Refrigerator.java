package com.ssafy;

public class Refrigerator extends Product{
	private int volume;
	private String doorColor;
	
	
	public Refrigerator() {
	}

	public Refrigerator(int num, String name, int price, int stock, int volume, String doorColor) {
		super(num, name, price, stock);
		this.volume = volume;
		this.doorColor = doorColor;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public String getDoorColor() {
		return doorColor;
	}

	public void setDoorColor(String doorColor) {
		this.doorColor = doorColor;
	}

	@Override
	public String toString() {
		return super.toString() + "Refrigerator [volume=" + volume + ", doorColor=" + doorColor + "]";
	}
}
