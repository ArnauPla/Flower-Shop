package com.flowershop.view;

import com.flowershop.application.FlowerShopController;

public class Main {
	
	private static FlowerShopController controller = new FlowerShopController();


	public static void main(String[] args) throws Exception {
		
		controller.crearFloristeria("Floristeria1");
		controller.afegirArbre(40.5,18.7);
		controller.afegirFlor(20.5,"vermell");		
		controller.afegirDecoracio(10.5,"fusta");	
		controller.veureStock("Floristeria1");
		
	}

}
