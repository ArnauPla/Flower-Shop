package com.flowershop.persistence;

import java.util.ArrayList;
import java.util.List;

import com.flowershop.domain.Decoration;
import com.flowershop.domain.Flower;
import com.flowershop.domain.Tree;

public class FlowerShopRepository {
	
	private static List<Tree> trees = new ArrayList<>();
	private static List<Flower> flowers = new ArrayList<>();
	private static List<Decoration> decorations = new ArrayList<>();

	public FlowerShopRepository()
	{
		
	}

	public List<Tree> getAllTrees()
	{
		return new ArrayList<>(trees);
	}

	public void addTree(Tree tree) throws Exception
	{
		if (tree == null)
			throw new Exception("No es pot afegir un membre nul.");
		trees.add(tree);
	}
	
	public List<Flower> getAllFlowers()
	{
		return new ArrayList<>(flowers);
	}

	public void addFlower(Flower flower) throws Exception
	{
		if (flower == null)
			throw new Exception("No es pot afegir un membre nul.");
		flowers.add(flower);
	}
	
	public List<Decoration> getAllDecorations()
	{
		return new ArrayList<>(decorations);
	}

	public void addDecoration(Decoration decoration) throws Exception
	{
		if (decoration == null)
			throw new Exception("No es pot afegir un membre nul.");
		decorations.add(decoration);
	}

}
