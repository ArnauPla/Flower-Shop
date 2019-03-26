package com.flowershop.domain;

public class Flower {
	
	protected double price;
	protected String color;
	
	public Flower(double price, String color)
	{
		this.price = price;
		this.color = color;
	}

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	public String getColor()
	{
		return color;
	}

	public void setColor(String color)
	{
		this.color = color;
	}
	
	
}
