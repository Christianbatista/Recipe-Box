package edu.mtc.egr283.RecipeBox;

import java.util.Scanner;

/*************************************************************
 * Class for handling the <code>Recipe</code>.
 * This is the class to handle individual records.
 *@author Christian Batista
 *@version 1.00 2019-22-04
 *Copyright (C) 2019 by Christian Batista. All rights reserved.
**/
public class Recipe {
	
	private String name; 
	private SLL<Integer> index;
	private SLL<RecipeIngredient> ingredients;
	private SLL<Instruction> instructions;
	private int RecipeNumber;
	
	Scanner console = new Scanner(System.in);
	
	/**
	 * Default Constructor
	 * @param name
	 * @param ingredients
	 * @param instructions
	 */
	public Recipe() {
		this.name = null;
		this.ingredients = null;
		this.instructions = null;
		this.RecipeNumber = 0;
	}// Default Constructor
	
	/**
	 * Constructor
	 * @param name
	 * @param ingredients
	 * @param instructions
	 */
	public Recipe(String name, SLL<RecipeIngredient> ingredients, SLL<Instruction> instructions) {
		this.name = name;
		this.ingredients = ingredients;
		this.instructions = instructions;
	}

	public void addIngredients(RecipeIngredient newIngre) {
		 this.ingredients.add(newIngre, this.ingredients.size());
		 this.index.add(this.RecipeNumber, this.index.size());
	 }// Ending bracket of addRecipe
	
	public void addInstructions(Instruction newInstr) {
		 this.instructions.add(newInstr,this.instructions.size());
		 this.index.add(this.RecipeNumber, this.index.size());
	 }// Ending bracket of addRecipe

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}// Ending bracket of getName

	/**
	 * @param name the name to set
	 */
	public void setName(String newName) {
		this.name = newName;
	}// Ending bracket of setName
	

	/**
	 * @return the recipeNumber
	 */
	public int getRecipeNumber() {
		return RecipeNumber;
	}// Ending bracket of method getRecipeNumber
	
	
	/**
	 * @return int size of Instructions SLL Size
	 */
	public int getSizeIngredients() {
	     if(this.ingredients.size() != this.index.size()) {
	       System.out.println("ERROR: unequal list sizes " +
	                          this.ingredients.size() + ", " +
	                          this.index.size());
	       System.exit(0);
	     }// Ending bracket of if 
	     return this.ingredients.size();
	   } // Ending bracket of method getSize
	
	/**
	 * @return int size of Instructions SLL Size
	 */
	public int getSizeInstructions() {
	     if(this.instructions.size() != this.index.size()) {
	       System.out.println("ERROR: unequal list sizes " +
	                          this.instructions.size() + ", " +
	                          this.index.size());
	       System.exit(0);
	     }// Ending bracket of if 
	     return this.instructions.size();
	   } // Ending bracket of method getSize	
	
	/**
	 * @param name
	 * @return boolean- true or false
	 */
	public boolean compareName(String name) {
		return (this.getName().equals(name));
	}// Ending bracket of method compareName
	
	/**
	 * @param otherRecipes
	 * @return int value
	 */
	public int compareTo(Object otherRecipes) {
		int rv = 0;
		
		if(otherRecipes instanceof Recipe) {
			Recipe temp = (Recipe) otherRecipes;
			if(this.getName().compareTo(temp.getName()) < 0) {
				rv = -1;
			}else if(this.getName().compareTo(temp.getName()) > 0){
				rv = +1;
			}// Ending bracket of if
		}// Ending bracket of outer if  
		return rv;
	}// Ending bracket of method compareTo

	public void createIngredient() {
		
		RecipeIngredient tempRi = new RecipeIngredient();
		 System.out.print("Input ingredient:");
		 String ingr = console.next(); 
		 tempRi.setIngredient(ingr);
		 
		 System.out.print("Input unit:");
		 String unit = console.next();
		 tempRi.setUnit(unit);
		 
		 System.out.print("Input quantity:");
		 int quantity = console.nextInt();
		 tempRi.setQuantity(quantity);
		 
		 this.ingredients.addAtHead(tempRi);
		 
	}// Ending bracket of method createRecipe
	
	public void createInstruction() {
		
		Instruction tempInstr = new Instruction();
		System.out.print("Input Instructions:");
		String instr = console.next(); 
		tempInstr.setInstruction(instr);
		
		this.instructions.addAtHead(tempInstr);
		
	}// Ending bracket of method createRecipe
		
}// Ending bracket of class Recipe