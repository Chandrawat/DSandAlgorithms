package com.practise;

public class LaptopComparable implements Comparable<LaptopComparable>{
	
	private String maker;
	private int ram;
	private int price;
	
	public LaptopComparable(String maker, int ram, int price) {
		super();
		this.maker = maker;
		this.ram = ram;
		this.price = price;
	}
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Laptop [maker=" + maker + ", ram=" + ram + ", price=" + price + "]";
	}
	/*
	 * current object is grater than laptop2 return +1
	 * current object is smaller than laptop2 return -1
	 * both are same return 0
	 */
	@Override
	public int compareTo(LaptopComparable laptop2) {
		if(this.getRam() > laptop2.getRam()) {
			return 1;
		}
		else if(this.getRam() == laptop2.getRam()) {
			return 0;
		}
		else {
			return -1;
		}
	
	}
	
	
	
}
