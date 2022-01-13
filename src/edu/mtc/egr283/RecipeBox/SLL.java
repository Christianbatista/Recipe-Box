package edu.mtc.egr283.RecipeBox;
/*************************************************************
 * Class for handling the <code>SLL</code>.
 * This is the class to handle individual records.
 *@author Christian Batista
 *@version 1.00 2019-22-04
 *Copyright (C) 2019 by Christian Batista. All rights reserved.
**/
public class SLL<E> {

	private int length;
	private SLLNode<E> head;
	private SLLNode<E> tail;

	public static final String COLON_SPACE = ": ";
	public static final String NEW_LINE= "\n";

	public SLL() {
		this.length = 0;
		this.tail = new SLLNode<E>();
		this.head = new SLLNode<E>(null, tail);
	}// Ending bracket of constructor

	   public int size() {
	       return this.length;
	   }// Ending bracket of method size

	   public E getDataAtPosition (int position) {
	       return (this.find(position)).getNodeData();
	   }// Ending bracket of method getDataAtPosition

	   public void addAtHead(E newNodeData) {
	       SLLNode<E> newNode = new SLLNode<E>(newNodeData, null);
	       this.addAfter(this.head, newNode);
	   }// Ending bracket of method addAtHead

	   public void add(E newNodeData, int position) {
	       SLLNode<E> newNode = new SLLNode<E>(newNodeData, null);
	       SLLNode<E> cursor = this.head ;

	   if(position > 0) {
	       cursor= this.find(position - 1);
	       }// Ending bracket of if

	       this .addAfter(cursor , newNode);
	   }// Ending bracket of method add

	   public E remove(E targetData) {
	       return this.remove(this.findindex(targetData));
	   }// Ending bracket of method remove(E)

	   public E remove(int position) {
	       SLLNode<E> cursor= this.head ;
	       if(position > 0) {
	           cursor= this .find(position - 1);
	       }// Ending bracket of if

	       SLLNode<E> targetNode = cursor.getNext();
	       cursor.setNext(targetNode.getNext() );
	       --this .length;

	       E rv= targetNode.getNodeData();

	       targetNode .setNext(null);
	       targetNode .setNodeData(null);

	       return rv;
	   }// Ending bracket of method remove(int) public String toString()
	     
	   public String toString() {
	       StringBuffer sb = new StringBuffer();

	       SLLNode<E> cursor= this .head.getNext();
	       int index= 0;
	      
	       while(cursor != this .tail) {
	           sb.append(index + SLL. COLON_SPACE) ;
	           sb .append(cursor.getNodeData() .toString()); sb.append(SLL.NEW_LINE) ;
	           cursor = cursor.getNext();
	           ++index;
	       }// Ending bracket of while loop

	       return sb.toString() ;
	   }// Ending bracket of method toString

	   private SLLNode<E> find(E targetData) {
	       SLLNode<E> rv = null;

	       SLLNode<E> cursor= this .head.getNext() ;
	       while(cursor != tail) {
	           if(cursor.getNodeData().equals(targetData)){
	               rv = cursor;
	               break;
	           }else {
	               cursor = cursor.getNext();
	           }// Ending bracket of if
	       }// Ending bracket of while loop

	       return rv;
	   }// Ending bracket of method find(E)

	   private SLLNode<E> find(int position){
	       SLLNode<E> cursor = this.head.getNext();
	       int index = 0;
	      
	       while((cursor != this.tail) && (index != position)) {
	           cursor = cursor.getNext();
	           ++index;
	       }// Ending bracket of while loop

	       return cursor;
	   }// Ending bracket of method find(int)

	   private int findindex(E targetData) {
	       int rv = 0;
	   SLLNode<E> cursor= this. head.getNext();
	   while((cursor != this.tail) &&
	   (! (cursor.getNodeData() .equals(targetData)))) {
	       cursor= cursor.getNext();
	       ++rv;
	   }// Ending bracket of while loop

	   if(rv == this .size()) {
	       rv = -1;
	   }// Ending bracket of if

	   return rv;
	   }// Ending bracket of method find index

	   private void addAfter(SLLNode<E> currentNode, SLLNode<E> newNode) {
	       newNode.setNext(currentNode .getNext());
	       currentNode.setNext(newNode) ;
	   ++this.length;
	   }// Ending bracket of method addAfter

	}// Ending bracket of class SLL<E>
