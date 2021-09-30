/** This is a private class inside the Linked
	 * List class for Nodes. This Node class contains
	 * instantiations for Nodes, the data in the Nodes,
	 * and the nextNode. It also has getters and setters
	 * used to call Nodes and set them with generic 
	 * values.
	 * 
	 * @author morganhardin
	 *
	 */
	public class Node <T>
	{
		/** These private variables will be
		 * used to make instantiate a generic
		 * data variable and a Node nextNode.
		 * This will go into the Linked List.
		 * It will also be used to point to 
		 * the next Node in both this class
		 * and Linked List.
		 * 
		 */
		T data; // Entry in bag
		@SuppressWarnings("rawtypes") 
		Node nextNode; // Link to next node

		/** This private Node constructor takes
		 * no parameters and sets data and nextNode
		 * equal to null so that they can be 
		 * instantiated in the Linked List.
		 * 
		 */
		Node()
		{
			data = null;
			nextNode = null;
		}
		
		/** This private Node constructor takes
		 * one generic data parameter and sets
		 * the inputed data equal to this data.
		 * It also sets nextNode equal to null
		 * so that both data and nextNode can be
		 * used in this Node class and called in
		 * Linked List.
		 * 
		 * @param data
		 */
		Node(T data)
		{
			this.data = data;	
			nextNode = null;
		} // end constructor
		
		/** This private getter method will
		 * return the generic data type 
		 * data when called.
		 * 
		 * @return
		 */
		T getData()
		{
			return data;
		}
		
		/** This private setter method will
		 * set this data to the inputed
		 * generic data from the parameter.
		 * 
		 * @param data
		 */
		void setData(T data)
		{
			this.data = data;
		}
		
		/** This private getter method will
		 * return the Node nextNode when
		 * called.
		 * 
		 * @return
		 */ 
		@SuppressWarnings("rawtypes") 
		Node getNextNode()
		{
			return nextNode;
		}
		
		/** This private setter method will
		 * set this nextNode to the inputed
		 * nextNode Node from the parameter.
		 * 
		 * @param nextNode
		 */
		@SuppressWarnings("rawtypes") 
		void setNextNode(Node nextNode)
		{
			this.nextNode = nextNode;
		}
		
		/** This public toString method will
		 * return getData as a String when
		 * the method is called.
		 * 
		 */
		@Override
		public String toString() 
		{
			return "" + getData();
		}
	} // end Node
