package com.ssafy;

public class TV extends Product {
	private int inch;
	private String displayType;
	
	public TV() {
	}
	
	public TV(int num, String name, int price, int stock, int inch, String displayType) {
		super(num, name, price, stock);
		this.inch = inch;
		this.displayType = displayType;
	}
	
	public int getInch() {
		return inch;
	}
	
	public void setInch(int inch) {
		this.inch = inch;
	}
	
	public String getDisplayType() {
		return displayType;
	}
	public void setDisplayType(String displayType) {
		this.displayType = displayType;
	}
	
	@Override
	public String toString() {
		return super.toString() + "TV [inch=" + inch + ", displayType=" + displayType + "]";
	}
	
}
