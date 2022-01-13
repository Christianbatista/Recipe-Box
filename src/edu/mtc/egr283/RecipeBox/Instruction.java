package edu.mtc.egr283.RecipeBox;

public class Instruction {
	
	/**
	 * Instance Variable
	 */
	private String instruction;

	/**
	 * @return the instruction
	 */
	public String getInstruction() {
		return instruction;
	}// Ending bracket of method getInstruction

	/**
	 * @param instruction the instruction to set
	 */
	public void setInstruction(String instruction) {
		this.instruction = instruction;
	}// Ending bracket of method setInstruction
	
	/* 
	 * @see java.lang.Object#toString()
	 */
	public String toString() {
		String s;
		s = String.format("%-20s"
				+ "", this.getInstruction());
		return s;
	}// Ending bracket of method toString
	
}// Ending bracket of class Instruction