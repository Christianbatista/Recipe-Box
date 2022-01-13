/**
 * 
 */
package edu.mtc.egr283.RecipeBox;

/**
 * @author Christian Batista
 *
 */
public class Unit {
	private String name;

	/**
	 * @param name
	 */
	public Unit() {
		super();
		this.name = null;
	}// Ending bracket of default constructor

	/**
	 * @param name
	 */
	public Unit(String name) {
		super();
		this.name = name;
	}// Ending bracket of constructor

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

}// Ending bracket of class Unit
