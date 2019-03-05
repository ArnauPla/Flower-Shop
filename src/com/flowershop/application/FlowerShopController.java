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
		System.out.println("S'ha creat la floristeria " + name);
	}

	public void afegirArbre(double price, double height) throws Exception {
		Tree tree = new Tree(price, height);
		repository.addTree(tree);
		System.out.println("S'ha afegit un arbre de " + price + " euros i " + height + " metres");
	}

	public void afegirFlor(double price, String color) throws Exception {
		Flower flower = new Flower(price, color);
		repository.addFlower(flower);
		System.out.println("S'ha afegit una flor de " + price + " euros i color " + color);
	}

	public void afegirDecoracio(double price, String material) throws Exception {
		Decoration decoration = new Decoration(price, material);
		repository.addDecoration(decoration);
		System.out.println("S'ha afegit un arbre de " + price + " euros i de " + material);
	}
	
	public void veureStock(String nameFlowerShop) throws Exception {
		System.out.println("La floristeria " + nameFlowerShop + " conté: ");

		veureArbres();
		veureFlors();
		veureDecoracions();

	}
	
	public void veureArbres() {
		System.out.println("Arbres:");
		for(int i = 0; i<repository.getAllTrees().size(); i++) {
			Tree arbre = repository.getAllTrees().get(i);
			System.out.println("Arbre " + (i + 1) + ": " + arbre.getPrice() + " euros i " + arbre.getHeight() + " metres");
		}
	}
	
	public void veureFlors() {
		System.out.println("Flors:");
		for(int i = 0; i<repository.getAllFlowers().size(); i++) {
			Flower flor = repository.getAllFlowers().get(i);
			System.out.println("Flor " + (i + 1) + ": " + flor.getPrice() + " euros i color " + flor.getColor());
		}
	}
	
	public void veureDecoracions() {
		System.out.println("Decoracions:");
		for(int i = 0; i<repository.getAllDecorations().size(); i++) {
			Decoration decoracio = repository.getAllDecorations().get(i);
			System.out.println("Decoració " + (i + 1)  + ": " + decoracio.getPrice() + " euros i de " + decoracio.getMaterial());
		}
	}

}