package edu.mtc.egr283.RecipeBox;

/*************************************************************
 * Class for handling the <code>RecipeIngredient</code>.
 * This is the class to handles individual ingredient records.
 *@author Christian Batista
 *@version 1.00 2019-22-04
 *Copyright (C) 2019 by Christian Batista. All rights reserved.
**/
public class RecipeIngredient{
	
	private int quantity;
	private Ingredient ingredient;
	private Unit unit;
	
	public RecipeIngredient() {
		this.quantity = 0;
		this.ingredient = null;
		this.unit = null;

	}// Ending bracket of default constructor

	/**
	 * @param quantity
	 * @param ingredient
	 * @param unit
	 */
	public RecipeIngredient(int quantity, Ingredient ingredient, Unit unit) {
		super();
		this.quantity = quantity;
		this.ingredient = ingredient;
		this.unit = unit;
	}// Ending bracket of constructor
	
	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}// Ending bracket of getQuantity
	
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}// Ending bracekt og setQuantity
	
	/**
	 * @return the ingredient
	 */
	public Ingredient getIngredient() {
		return ingredient;
	}// Ending bracekt of getIngredient
	
	/**
	 * @param ingredient the ingredient to set
	 */
	public void setIngredient(String ingr) {
		Ingredient ig = new Ingredient(ingr);
		this.ingredient = ig;
	}// Ending bracket o setIngredient
	
	/**
	 * @return the unit
	 */
	public Unit getUnit() {
		return unit;
	}// Ending bracket og getUnit
	
	/**
	 * @param unit the unit to set
	 */
	public void setUnit(String unit) {	
		Unit u = new Unit(unit);
		this.unit = u;
	}// Ending bracket of method setUnit
	
	
//	public int compareTo(Object otherRecipeIngredient) {
//		int rv = 0;
//		
//		if(otherRecipeIngredient instanceof RecipeIngredient) {
//			RecipeIngredient temp = (RecipeIngredient) otherRecipeIngredient;
//			
//			if(this.ingredient.compareTo(temp.ingredient) < 0) {
//				rv = -1;
//			}else if(this.ingredient.compareTo(temp.ingredient) > 0){
//				rv = +1;
//			}// Ending bracket of if
//		}// Ending bracket of outer if  
//		return rv;
//	}// Ending bracket of method compareTo
	
	public String toString() {
		String s;
		s = String.format("%-10s %4d %4d"
				+ "", this.getQuantity(),this.getUnit().toString(),this.getIngredient().toString());
		return s;
	}// Ending bracket of method toString
	
}// Ending bracket of class RecipeIngredient