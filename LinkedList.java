/** This class will call the Node class
 * and will add nodes to the Linked List,
 * check to see if its empty, and get the
 * head node in the list.
 * 
 * @author morganhardin
 *
 */
public class LinkedList <T>
{
	/** These instantiate head, tail, 
	 * next, and node as Nodes.
	 */
	@SuppressWarnings("rawtypes")
	public Node head, tail, node, next;
	
	/** This public instantiation of the
	 * Node class creates a new instance
	 * called myNode will a null parameter
	 * and generic data types. This will be
	 * used in this class and the Queue
	 * class.
	 * 
	 */
	public Node<T> myNode = new Node<T>(null);
	
	/** This instantiates queue as a 
	 * String variable.
	 * 
	 */
	public String queue;
	
	/** This instantiates length as in integer.
	 */
	public int length;
	
	/** This is an empty constructor that sets
	 * head equal to null, length equal
	 * to 0, and tail equal to head.
	 */
	public LinkedList()
	{
		head = null;
		length = 0;
		tail = head;
	}
	
	/** This is a boolean method that returns
	 * true if head is null and false if head 
	 * is not null, showing if the Linked List
	 * is empty of not based on the head Node.
	 * 
	 * @return
	 */
	public boolean isEmpty()
	{
		if (head == null)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/** This generic getFront method will
	 * check if the queue is empty with the
	 * isEmpty class. If it is, it will throw
	 * an exception. If not, it will return
	 * the head Node and its data (generic).
	 * 
	 * @return
	 * @throws Exception 
	 */
	@SuppressWarnings("unchecked")
	public T getFront() throws Exception
	{
		if (isEmpty()) 
		{
			throw new Exception ("This queue is empty.");
		}
		else
		{
			return (T) head.getData();
		}
	}
	
	/** This method passes in a Node entry 
	 * and tests if the queue is empty. If it
	 * is, head and tail will be set equal to 
	 * the inputed entry Node. Then, it sets
	 * tail and tail.nextNode equal to their
	 * respective variables to successfully
	 * add a node to the Linked List.
	 * 
	 * @param aNode
	 */
	@SuppressWarnings("unchecked")
	public void addNode(Node<T> data)
	{
		if (isEmpty())
		{
			head = data;
			tail = head;
			return;
		}
		tail.nextNode = data;
		tail = tail.nextNode;
		tail.nextNode = null;
	}
}
