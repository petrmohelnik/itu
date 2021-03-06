package com.example.todo;

import java.util.ArrayList;

public class Node {
	protected int id; //id ukolu
	protected String description; //popis ukolu
	protected Node parent; //odkaz na rodicovsky prvek
	protected ArrayList<Node> children; //kontejner potomku
	
	/**
	 * konstruktor
	 * @param p //rodic
	 * @param i //id
	 */
	public Node(Node p, int i)
	{
		id = i;
		description = "Popis ukolu";
		parent = p;
		children = new ArrayList<Node>(0);
	}
	
	/**
	 * nastavi popis ukolu
	 * @param newDescription
	 */
	public void setDescription(String newDescription)
	{
		description = newDescription;
	}
	
	/**
	 * vrati popis ukolu
	 * @return
	 */
	public String getDescription()
	{
		return description;
	}
	
	/**
	 * vrati rodice
	 * @return
	 */
	public Node getParent()
	{
		return parent;
	}
	
	/**
	 * vrati deti
	 * @return
	 */
	public ArrayList<Node> getChildren()
	{
		return children;
	}
	
	/**
	 * prida potomka
	 * @param child
	 */
	public void addChild(Node child)
	{
		children.add(child);
	}
	
	/**
	 * vrati id ukolu
	 * @return
	 */
	public int getID()
	{
		return id;
	}

}
