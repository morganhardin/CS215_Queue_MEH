/** This application class has a main
 * method that instantiates a new variation
 * of the Queue class. It tests removing,
 * adding, and calling the front of the queue.
 * 
 * @author morganhardin
 *
 */
public class Application 
{
	public static void main(String[] args) throws Exception
	{
		Queue<String> myQueue = new Queue<>();
		
		System.out.println("Queue: ");
		myQueue.enqueue("Jane");
		myQueue.enqueue("Jess");
		myQueue.enqueue("Jill");
		System.out.println("\nQueue Item Moved: ");
		myQueue.enqueue(myQueue.dequeue());
		System.out.println("\nQueue: ");
		myQueue.Return();
		System.out.println("\nQueue Front: ");
		myQueue.enqueue(myQueue.getFront());
		System.out.println("\nQueue Added Item: ");
		myQueue.enqueue("Jim");
		System.out.println("\nQueue: ");
		myQueue.Return();
		String name = myQueue.dequeue();
		System.out.println("\nQueue Name Removed: \n\t" + name);
		System.out.println("Queue Front: ");
		myQueue.enqueue(myQueue.getFront());
		System.out.println("\nFINAL QUEUE: ");
		myQueue.Return();
	}
}
