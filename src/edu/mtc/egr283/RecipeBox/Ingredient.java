package edu.mtc.egr283.RecipeBox;

/**
 * @author Christian Batista
 *
 */
public class Ingredient {

	private String name;

	/**
	 * @param name
	 */
	public Ingredient() {
		this.name = null;
	}// Ending bracket of Constructor

	/**
	 * @param name
	 */
	public Ingredient(String name) {
		this.name = name;
	}// Ending bracket of Constructor

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}// Ending bracket of method getName

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}// Ending bracket of method setName

	/*
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		String s;
		s = String.format("%-10s" + "", this.getName());
		return s;
	}// Ending bracket of method toString

}// Ending bracket of class Ingredient
