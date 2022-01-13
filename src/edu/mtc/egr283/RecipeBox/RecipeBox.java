package edu.mtc.egr283.RecipeBox;

import java.util.Scanner;

/*************************************************************
 * Class for handling the <code>RecipeBox</code>.
 * This is the class to handles all records.
 *@author Christian Batista
 *@version 1.00 2019-22-04
 *Copyright (C) 2019 by Christian Batista. All rights reserved.
**/
public class RecipeBox {
	
	private SLL<Integer> index;
	private SLL<Recipe> recipes;
	private Recipe tempRecipe;
	private Scanner console;
	
	 public RecipeBox() {
		 console = new Scanner(System.in);
		 recipes = new SLL<Recipe>();
	 }// Ending bracket of RecipeBox

	 public void addRecipe(Recipe newRecipe) {
		 this.recipes.addAtHead(newRecipe); 
	 }// Ending bracket of addRecipe
	 
	 /**
	  * Method to findGame in the GameCatalogue by name of the game 
	  * @param nameToFind
	  */
	 public Recipe findRecipe(String nameToFind) {
			
		 Recipe rv = null;
			
		 for(int i = 0; i < this.recipes.size(); ++i) {
			 if((this.recipes.getDataAtPosition(i).compareName(nameToFind))) {
				 rv = this.recipes.getDataAtPosition(i);
				 rv.toString();
				 break;
			 }// Ending bracket of if
		 }// Ending bracket of for loop
			
		 return rv;
	 } // Ending bracket of findGame
	 
	 public int getSize() { 
	     return this.recipes.size();
	 } // Ending bracket of method getSize
	 
	 private boolean displayMenu() {
		 boolean done = false;
		 
		 System.out.println ("*********** Recipe Box ***********:");
		 System.out.println ("Please type the number of the operation you would "
				                            + "like to perform:");
		 System.out.println ("1. Add a recipe at the head of the list");
		 System.out.println ("2. Add a recipe at a spcific location");
		 System.out.println ("3. Add a recipe at the end of the list");
		 System.out.println ("4. Delete a recipe");
		 System.out.println ("5. Edit a recipe");
		 System.out.println ("6. Display Recipe List");
		 System.out.println ("7. Display the Ingredients List of a recipe");
		 System.out.println ("8. Display the Instructions List of a recipe");
		 System.out.println ("9. Exit");
		 
		 int num = console.nextInt();
		 switch(num) {
		 
		 case 1:
			 tempRecipe = new Recipe();
			 System.out.println("Input recipe Name:");
			 String recipeName = console.next();
			 tempRecipe.setName(recipeName);	 
			 
			 String inputadd= "yes";
			 
			 do{
				 if(inputadd.equalsIgnoreCase("Yes")) {	
					 Recipe addNewRecipe = new Recipe();
					 
					 addNewRecipe.createIngredient();
					 addNewRecipe.createInstruction();
						
					 recipes.addAtHead(addNewRecipe);
					 System.out.println("Is there another ingredient? input Yes or No ");
					 inputadd = console.next();
					 if(inputadd.equalsIgnoreCase("Yes")) {
						 continue;
					 }// Ending bracket of if
				 }// Ending bracket of if 
						
				 System.out.println("The data has been added");
				System.out.println();
			 } while(inputadd.equalsIgnoreCase("Yes"));	 
			 
			 break;
		 case 6: 
			
			 break;
		 case 7:
			 findRecipe("Test");
		 case 9: 
			 done = true;
			 break;
		 default: 
			 System.out.println("Invalid entry"); 
			 break;
		 }// Ending bracket of switch
		 
		 return done;
	 }// Ending bracket displayMenu
	  
	 public void run() {
		 boolean done = false;
		 while(!done) {
			 done = displayMenu();
		 }// Ending bracket of while loop
	 }// Ending bracket of method run
	 	 
	 /*************************************************************** 
	  * Method calls the toString method in the Game class to print out the 
	  * name, minAge, maxAge, minPlayers, maxPlayers, minPlayTime, maxPlayTime
	 **/
	 public String toString() {
		 String s = "";
		 for(int i = 0; i < this.getSize(); ++i) {
			 s += String.format("%s(idx,rec) (%d,%d) %s%n", i, this.index.getDataAtPosition(i),
					 recipes.getDataAtPosition(this.index.getDataAtPosition(i)).toString());
		 }// Ending bracket of for loop
		 return s;
	 }// Ending bracket of method toString
	 
}// Ending bracket of Class RecipeBox