package edu.mtc.egr283.RecipeBox;

	public class SLLNode<T> {
		  
		private T nodeData;
		private SLLNode<T> next;
		  
		public SLLNode() {
			this(null, null);
		}// Ending bracket of default constructor

		public SLLNode(T newNodeData, SLLNode<T> newNext) {
			this.nodeData = newNodeData;
			this.next = newNext;
		}// Ending bracket of constructor

		public T getNodeData() {
			return this.nodeData;
		}// Ending bracket of method getNodeData
		  
		public void setNodeData(T newNodeData) {
			this.nodeData = newNodeData;
		}// Ending bracket of method setNodeData
		  
		public SLLNode<T> getNext() {
			return this.next;
		}// Ending bracket of method getNext
		  
		public void setNext(SLLNode<T> newNext) {
			this.next = newNext;
		}// Ending bracket of method setNext

	}// Ending bracket of class SLLNode