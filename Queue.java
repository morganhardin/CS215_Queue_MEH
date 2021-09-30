/** This public Queue class will add items to a
 * queue through a LinkedList that this class
 * extends. This allows those methods and variables
 * to be called and used in this class.
 * 
 * @author morganhardin
 *
 */
public class Queue <T> extends LinkedList<T>
{
	/** This void enqueue method takes the generic
	 * data and creates a new instance of the Node
	 * class, passing data into the parameter. It
	 * checks if the queue is empty and if it is,
	 * will call the addNode class in LinkedList to
	 * add this need node instantiation into the list.
	 * If the queue is not empty, it will set tail
	 * nextNode equal to the new inputed data node and 
	 * will print the node.
	 * 
	 * @param data
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	void enqueue(T data)
	{
		Node node = new Node(data);
		if (isEmpty())
		{
			addNode(node);
		}
		else
		{
			tail.setNextNode(node);
		}
		tail = node;
		length++;
		System.out.print("\t" + node);
		//result = result + "\t" + node + "\n";
	}
	
	/** This generic method removes
	 * the latest entry in the queue.
	 * This means that it removes the
	 * generic entry that was most 
	 * recently added via the enqueue
	 * method. It does this by setting head
	 * equal to null and setting the new
	 * head equal to head's nextNode. It
	 * then returns the new head.
	 * 
	 * @return
	 * @throws Exception 
	 */
	@SuppressWarnings("unchecked")
	T dequeue() throws Exception
	{
		T front = getFront();
		if (length == 0)
		{
			System.out.println("This queue is empty.");
		}
		else if (length > 0)
		{
			length--;
			head.setData(null);
			head = head.getNextNode();
			if (this.head == null)
			{
				tail = null;
				System.out.println("\nThis queue is empty.");
			}
		}
		return front;
	}
	
	/** This public void method is used
	 * to circle through the items that
	 * have been added to the queue.
	 * It will print the current node, 
	 * starting with the head, and circling
	 * through based on the length and 
	 * current.nextNode. 
	 * 
	 */
	@SuppressWarnings("rawtypes")
	public void Return() 
	{
		Node current = head;
		for (int i = 0; i < length; i++)
		{
			System.out.print("\t" + current);
			current = current.nextNode;
		}
	}
}
