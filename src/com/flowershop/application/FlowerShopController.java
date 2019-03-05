package com.flowershop.application;

import com.flowershop.domain.Decoration;
import com.flowershop.domain.Flower;
import com.flowershop.domain.FlowerShop;
import com.flowershop.domain.Tree;
import com.flowershop.persistence.FlowerShopRepository;

public class FlowerShopController {
	
	private FlowerShopRepository repository = new FlowerShopRepository();
	
	public FlowerShopController() {
		
	}

	public void crearFloristeria(String name){
		FlowerShop flowerShop = new FlowerShop(name);
	}

	public void afegirArbre(double price, double height) throws Exception {
		Tree tree = new Tree(price, height);
		repository.addTree(tree);
	}

	public void afegirFlor(double price, String color) throws Exception {
		Flower flower = new Flower(price, color);
		repository.addFlower(flower);
	}

	public void afegirDecoracio(double price, String material) throws Exception {
		Decoration decoration = new Decoration(price, material);
		repository.addDecoration(decoration);
	}

}
