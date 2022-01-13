package edu.mtc.egr283.RecipeBox;

import java.util.Scanner;

/**
 * The Driver Class is what runs the program
 * @author Christian Batista
 *
 */
public class RecipeDriver {

	public static void main(String[] args) {

		RecipeBox rb = new RecipeBox();
		Scanner console = new Scanner(System.in);
		String con = "Yes";

		do {
			rb.run();
			System.out.println("Do you want to continue");
			con = console.next();
		} while (con.equalsIgnoreCase("Yes"));

		console.close();
	}
}// Ending bracket of class Driver
