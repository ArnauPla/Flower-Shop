package com.flowershop.domain;

public class Decoration {

	protected double price;
	protected String material;
	
	public Decoration(double price, String material)
	{
		this.price = price;
		this.material = material;
	}

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material)
	{
		this.material = material;
	}
	
}
