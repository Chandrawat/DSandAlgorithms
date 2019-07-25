package com.practise;



public class LaptopComparator {
	
	private String maker;
	private int ram;
	private int price;
	
	public LaptopComparator(String maker, int ram, int price) {
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
	
	
}
