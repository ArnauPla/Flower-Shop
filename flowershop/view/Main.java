package com.flowershop.view;

import com.flowershop.application.FlowerShopController;

public class Main {
	
	private static FlowerShopController controller = new FlowerShopController();

	public static void main(String[] args) throws Exception
	{
		controller.createFlowershop("Floristeria1");
		controller.addTree(40.5,18.7);
		controller.addFlower(20.5,"vermell");
		controller.addDecoration(10.5,"fusta");
		controller.getStock("Floristeria1");
		
	}

}
