/** This imports to java Scanner class.
 * 
 */
import java.util.Scanner;
/** This class is another application class
 * that has a main method and will create a
 * different instantiation of the queue class.
 * It will provide a more realistic use for the
 * queue by allowing the user to input data types
 * that will go into the queue to then be added,
 * removed, and allowed to view the front.
 * 
 * @author morganhardin
 *
 */
public class Application2 
{
	public static void main(String[] args) throws Exception
	{
		Queue<String> myQueue = new Queue<>();
		Scanner input = new Scanner(System.in);
		boolean loop = true;
		boolean loop2 = true;
		
		System.out.print("Please enter a word or integer: \n--> ");
		String answer = input.nextLine();
		
		while (loop == true)
		{
			System.out.println("\nQueue: ");
			myQueue.enqueue(answer);
			System.out.println();
			
			while (loop2 == true)
			{
				System.out.print("\nWould you like to: \n\t1) Add Word / Integer\n\t2) Remove Queued Item\n\t3) Show Front\n\t4) Move Front to Back\n\t5) Stop\n--> ");
				String choice = input.nextLine().toUpperCase();
				
				if (choice.contains("AD") || choice.contains("WO") || choice.contains("INT"))
				{
					System.out.print("\nPlease enter a word or integer: \n--> ");
					answer = input.nextLine();
					System.out.println("\nAdded to Queue: ");
					myQueue.enqueue(answer);
					System.out.println("\nQueue: ");
					myQueue.Return();
					System.out.println();
				}
				else if (choice.contains("REM") || choice.contains("IT"))
				{
					if (myQueue.length == 0)
					{
						myQueue.dequeue();
						System.out.println();
					}
					else if (myQueue.length > 0)
					{
						myQueue.dequeue();
						System.out.println("\nQueue: ");
						myQueue.Return();
						System.out.println();
					}
				}
				else if (choice.contains("SH") && choice.contains("FR"))
				{
					System.out.println("\nQueue Front: \n\t" + myQueue.getFront());
				}
				else if (choice.contains("MO") && choice.contains("FR") && choice.contains("BA"))
				{
					System.out.println("\nQueued Word Being Moved: ");
					myQueue.enqueue(myQueue.dequeue());
					System.out.println("\nQueue: ");
					myQueue.Return();
					System.out.println();
				}
				else if (choice.contains("ST"))
				{
					loop2 = false;
					loop = false;
				}
			}
		}
		
		System.out.println("\nFINAL QUEUE: ");
		myQueue.Return();
		
		input.close();
	}
}
