package com.flowershop.domain;

public class Tree {

	protected double price;
	protected double height;
	
	public Tree(double price, double height)
	{
		this.price = price;
		this.height = height;
	}

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	public double getHeight()
	{
		return height;
	}

	public void setHeight(double height)
	{
		this.height = height;
	}
	

	
}
